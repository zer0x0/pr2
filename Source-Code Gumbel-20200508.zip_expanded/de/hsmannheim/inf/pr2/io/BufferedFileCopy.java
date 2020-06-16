package de.hsmannheim.inf.pr2.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedFileCopy {
  public static void main(String[] args) throws IOException {

    String quelle = "files/ipsumfile.txt";    // Quell und
    String ziel = "files/ipsumfile-copy.txt"; // Zieldatei.

    InputStream in = new BufferedInputStream(
            new FileInputStream(quelle));

    OutputStream out = new BufferedOutputStream(
            new FileOutputStream(ziel));

    byte[] buffer = new byte[1024];
    int gelesen;

    while ((gelesen = in.read(buffer)) > -1) {
      out.write(buffer, 0, gelesen);
    }

    in.close();
    out.close();
  }
}
