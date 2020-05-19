package de.hsmannheim.inf.pr2.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class UpperCaseReaderDemo {

  public static void main(String[] args) throws IOException {
    String dateiname = "files/ipsumfile.txt";
    BufferedReader reader = new BufferedReader(
            new UpperCaseReader(
                    new FileReader(dateiname)));
    String zeile;

    while ((zeile = reader.readLine()) != null) {
      System.out.println(zeile);
    }
    reader.close();
  }
}
