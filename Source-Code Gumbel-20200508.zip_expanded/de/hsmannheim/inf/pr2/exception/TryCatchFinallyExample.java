package de.hsmannheim.inf.pr2.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class TryCatchFinallyExample {

  public static void tryCatch() {

    Connection connection = getConnection();

    try {
      ResultSet rs = readData(connection);

      while (rs.next()) {
        // Daten bearbeiten.
      }
    } catch (SQLException ex) {
      // Datenbank Problem behandeln.
      String sqlStatus = ex.getSQLState();
      // ...
      ex.printStackTrace();
    }
  }

  public static void tryCatchMany() {

    Connection connection = getConnection();

    try {
      ResultSet rs = readData(connection);

      while (rs.next()) {
        storeToFile(rs.getString(0), rs);
      }
    } catch (SQLException ex) {
      // Datenbank-Problem.
      ex.printStackTrace();
    } catch (FileNotFoundException ex) {
      // Datei nicht gefunden.
      System.out.println(ex.getMessage());
    } catch (IOException ex) {
      // Allgemeiner IO-Fehler.
      System.out.println(ex.getMessage());
    }
  }

  public static void tryCatchManyAsOne() {
    try {
      openFile();
      writeToDatabase();
    } catch (FileNotFoundException | SQLException e) {
      System.out.println("Ohje, alles kaputt...:" + e);
    }
  }

  public static void tryCatchFinally() {
    Connection connection = getConnection();

    try {
      ResultSet rs = readData(connection);

      while (rs.next()) {
        // Daten bearbeiten
      }
      return;
    } catch (SQLException ex) {
      // Datenbank Problem behandeln.
    } finally {
      releaseConnection(connection); // Wird immer ausgeführt!
    }
  }

  public static void tryFinally() throws SQLException {
    Connection connection = getConnection();

    try {
      ResultSet rs = readData(connection);

      while (rs.next()) {
        // Daten bearbeiten.
      }
      return;
    } finally {
      releaseConnection(connection); // Wird immer ausgeführt!
    }
  }

  public static void tryCatchFinallyException() throws SQLException {
    Connection connection = getConnection();

    try {
      ResultSet rs = readData(connection);

      while (rs.next()) {
        // Daten bearbeiten.
      }
      return;
    } finally {
      try {
        cleanupConnection(connection);
      } catch (SQLException ex) {
        // Hier kann man nichts mehr machen.
      }
    }
  }

  public static void printArray(int[] array) {
    try {
      for (int i = 0; ; i++) {
        System.out.println(array[i]);
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
    }
  }

  private static ResultSet readData(Connection connection)
          throws SQLException {
    return null;
  }

  private static void storeToFile(String header, ResultSet rs)
          throws IOException, FileNotFoundException {
  }

  private static Connection getConnection() {
    return null;
  }

  private static void releaseConnection(Connection connection) {
  }

  private static void cleanupConnection(Connection connection)
          throws SQLException {
  }

  private static void openFile() throws FileNotFoundException {
  }

  private static void writeToDatabase() throws SQLException {
  }
}
