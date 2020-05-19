package de.hsmannheim.inf.pr2.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharsDemo {

  public static void main(String[] args) throws IOException {
    readChars();
  }

  public static void readChars() throws IOException {
    Reader fr = new FileReader("files/ipsumfile.txt");
    int daten;

    while ((daten = fr.read()) > -1) {
      char c = (char) daten;
      // Jetzt kann man etwas sinnvolles mit den Zeichen machen,
      // die aus der Datei gelesen wurden.
    }
    fr.close();
  }

  /**
   * So geht es nicht!
   * @throws IOException
   */
  public static void readCharsWrong() throws IOException {
    Reader fr = new FileReader("files/ipsumfile.txt");
    char b;

    while ((b = (char) fr.read()) > -1) {
      // Jetzt kann man etwas sinnvolles mit den Zeichen machen,
      // die aus der Datei gelesen wurden.
    }
    fr.close();
  }

  public static void readCharArray() throws IOException {
    Reader fr = new FileReader("files/ipsumfile.txt");
    char[] daten = new char[1024];
    int charactersRead;

    while ((charactersRead = fr.read(daten)) > -1) {
      // Jetzt kann man etwas sinnvolles mit den Zeichen machen,
      // die aus der Datei gelesen wurden.
    }
    fr.close();
  }
}
