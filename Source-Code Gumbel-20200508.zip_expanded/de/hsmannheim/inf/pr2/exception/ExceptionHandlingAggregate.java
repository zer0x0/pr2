package de.hsmannheim.inf.pr2.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ExceptionHandlingAggregate {
  public static void main(String[] args) throws IOException {
    mergeData("/tmp/output.dat");
  }

  public static void mergeData(String outFile)
          throws IOException {
    writeData(outFile);
  }

  public static void writeData(String outFile) throws IOException {
    aggregate(5, 5);
  }

  public static int aggregate(int a, int b) throws IOException {
    // Eine FileNotFoundException sollte hier behandelt werden:
    FileInputStream f = new FileInputStream("/tmp/input.dat");
    return 1;
  }
}
