package de.hsmannheim.inf.pr2.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class WriteBytesDemo {

  public static void main(String[] args) throws IOException {
    writeBytes();
    writeByteArray();
    appendByteArray();
  }

  public static void writeBytes() throws IOException {
    OutputStream fos = new FileOutputStream("/tmp/cafe.dat");

    fos.write(0xca);
    fos.write(0xfe);
    fos.write(0xba);
    fos.write(0xbe);

    fos.close();
  }

  public static void writeByteArray() throws IOException {
    OutputStream fos = new FileOutputStream("/tmp/cafe.dat");
    byte[] daten = {(byte) 0xca, (byte) 0xfe,
            (byte) 0xba, (byte) 0xbe};

    fos.write(daten);
    fos.write(daten, 0, 2);
    fos.write(daten, 0, 2);
    fos.write(daten, 2, 2);
    fos.write(daten, 2, 2);

    fos.close();
  }

  public static void appendByteArray() throws IOException {
    byte[] daten = {(byte) 0xca, (byte) 0xfe,
            (byte) 0xba, (byte) 0xbe};

    OutputStream fos = new FileOutputStream("/tmp/cafe.dat");
    fos.write(daten);
    fos.close();

    OutputStream fos2 =
            new FileOutputStream("/tmp/cafe.dat", true);
    fos2.write(daten);
    fos2.close();
  }
}
