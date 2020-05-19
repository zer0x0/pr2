package de.hsmannheim.inf.pr2.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class FileCopy {

  public static void main(String[] args) throws IOException {
    String quelle = "files/ipsumfile.txt";    // Quell und
    String ziel = "files/ipsumfile-copy.txt"; // Zieldatei.

    // Streams für Quell und Zieldatei:
    InputStream in = new FileInputStream(quelle);
    OutputStream out = new FileOutputStream(ziel);

    byte[] buffer = new byte[1024];  // Puffer für Dateiinhalt.
    int gelesen;                     // Anzahl gelesener Bytes.

    // Daten aus Quell- in Zieldatei kopieren:
    while ((gelesen = in.read(buffer)) > -1) {
      out.write(buffer, 0, gelesen);
    }

    in.close(); // Streams schließen.
    out.close();
  }
}
