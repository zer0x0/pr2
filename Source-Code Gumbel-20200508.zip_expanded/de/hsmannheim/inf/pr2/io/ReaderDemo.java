package de.hsmannheim.inf.pr2.io;

import java.io.*;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ReaderDemo {

  public static void main(String[] args) throws IOException {
    stringReader();
    bufferedReader();
  }

  public static void stringReader() throws IOException {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
            "Nulla laoreet, sem vel mollis imperdiet, sapien mauris\n" +
            "sollicitudin arcu, sed viverra nulla dui at est.\n" +
            "Nunc est erat, semper id sollicitudin ut, pretium ac eros.\n";

    Reader sr = new StringReader(text);
    int gelesen;
    while ((gelesen = sr.read()) > -1) {
      System.out.print((char) gelesen);
    }
    sr.close();
  }

  public static void bufferedReader() throws IOException {
    String dateiname = "files/ipsumfile.txt";
    BufferedReader reader = new BufferedReader(
            new FileReader(dateiname));
    String zeile;
    int nummer = 1;
    while ((zeile = reader.readLine()) != null) {
      System.out.printf("%03d %s%n", nummer, zeile);
      nummer++;
    }
    reader.close();
  }
}
