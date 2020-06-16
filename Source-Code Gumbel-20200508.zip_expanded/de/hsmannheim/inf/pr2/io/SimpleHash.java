package de.hsmannheim.inf.pr2.io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SimpleHash {

  public static void main(String[] args) throws IOException {
    String datei = "/tmp/quelle.txt";
    InputStream in = new FileInputStream(datei);
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    int daten;

    while ((daten = in.read()) > -1) {
      out.write(daten);
    }
    in.close();
    out.close();

    byte[] bytes = out.toByteArray();
    long sum = 0;

    for (int i = 0; i < bytes.length; i++) {
      sum += bytes[i];
    }
    System.out.println(sum);
  }
}
