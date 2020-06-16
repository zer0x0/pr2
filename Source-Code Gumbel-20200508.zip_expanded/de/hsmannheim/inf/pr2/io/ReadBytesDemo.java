package de.hsmannheim.inf.pr2.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ReadBytesDemo {

  public static void main(String[] args) throws IOException {
    readByte();
    readByteArray();
    readByteWrong();
  }

  public static void readByte() throws IOException {
    InputStream fis = new FileInputStream("files/bindata.dat");
    int daten;

    while ((daten = fis.read()) > -1) {
      byte b = (byte) daten;
      // Jetzt kann man etwas sinnvolles mit den Bytes machen,
      // die aus der Datei gelesen wurden.
    }
    fis.close();
  }

  public static void readByteWrong() throws IOException {
    FileInputStream fis = new FileInputStream("files/bindata.dat");
    byte b;

    while ((b = (byte) fis.read()) > -1) {
      // Jetzt kann man etwas sinnvolles mit den Bytes machen,
      // die aus der Datei gelesen wurden.
    }
    fis.close();
  }

  public static void readByteArray() throws IOException {
    InputStream fis = new FileInputStream("files/bindata.dat");
    byte[] daten = new byte[1024];
    int bytesRead;

    while ((bytesRead = fis.read(daten)) > -1) {
      // Jetzt kann man etwas sinnvolles mit den Bytes machen,
      // die aus der Datei gelesen wurden.
    }
    fis.close();
  }
}
