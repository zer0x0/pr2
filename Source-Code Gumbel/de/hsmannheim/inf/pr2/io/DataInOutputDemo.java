package de.hsmannheim.inf.pr2.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class DataInOutputDemo {

  public static void main(String[] args) throws IOException {

    DataOutputStream out = new DataOutputStream(
            new BufferedOutputStream(
                    new FileOutputStream("/tmp/daten.dat")));

    out.writeUTF("** Datendatei **");  // Unicode Transform. Format
    out.writeUTF("Datum");
    out.writeLong(new Date().getTime());
    out.writeUTF("PI");
    out.writeDouble(Math.PI);

    out.close();

    DataInputStream dis = new DataInputStream(
            new BufferedInputStream(
                    new FileInputStream("/tmp/daten.dat")));

    String header = dis.readUTF();
    String datumTag = dis.readUTF();
    Date datum = new Date(dis.readLong());
    String PITag = dis.readUTF();
    double pi = dis.readDouble();

    dis.close();

    System.out.println(header);
    System.out.println(datumTag + " " + datum);
    System.out.println(PITag + " " + pi);
  }
}
