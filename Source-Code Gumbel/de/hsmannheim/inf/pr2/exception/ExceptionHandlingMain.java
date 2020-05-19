package de.hsmannheim.inf.pr2.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ExceptionHandlingMain {

  public static void main(String[] args) throws IOException {
    mergeData("/tmp/input.dat", "/tmp/output.dat");
  }

  public static void mergeData(String inFile, String outFile)
          throws IOException {
    writeData(inFile, outFile);
  }

  public static void writeData(String inFile, String outFile)
          throws IOException {
    aggregate(5, 5, inFile);
  }

  public static int aggregate(int a, int b, String inFile)
          throws IOException {
    FileInputStream f = new FileInputStream(inFile);
    return 1;
  }
}
