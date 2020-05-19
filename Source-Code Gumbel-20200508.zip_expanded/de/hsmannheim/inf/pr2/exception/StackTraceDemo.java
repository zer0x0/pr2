package de.hsmannheim.inf.pr2.exception;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class StackTraceDemo {
  public static void main(String[] args) throws Exception {
      FileInputStream fis =
              new FileInputStream(new File("/tmp"));
  }
}
