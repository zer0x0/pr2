package de.hsmannheim.inf.pr2.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 */
public class WriterDemo {
  public static void main(String[] args) throws IOException {
    writeChars();
    writeStrings();
    redirect();
  }

  public static void writeChars() throws IOException {
    Writer fw = new FileWriter("files/chartext.txt");

    fw.write('T');
    fw.write('e');
    fw.write('x');
    fw.write('t');
    fw.write('\n'); // Newline

    fw.close();
  }

  public static void writeStrings() throws IOException {
    Writer fw = new FileWriter("files/stringtext.txt");
    String daten = "Dies ist ein Text"; // 17 Zeichen

    fw.write(daten); // Gesamter String.
    fw.write(daten, 0, 5); // 5 Zeichen ab Pos. 1 ("Dies ").
    fw.write(daten, 0, 5); // nochmal
    fw.write(daten, 12, 5); // 4 Zeichen ab Pos. 13 (" Text").
    fw.write(daten, 12, 5); // nochmal

    fw.write("\n"); // Newline

    fw.close();
  }

  public static void redirect() throws IOException {
    PrintStream ps = new PrintStream("files/umleitung.txt");
    System.setOut(ps);

    System.out.println("Hallo, das kommt ja gar nicht raus...");

    ps.close();
  }
}
