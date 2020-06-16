package de.hsmannheim.inf.pr2.exception;
import java.io.IOException;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ThrowExample {

  public static void main(String[] args) {
    throwExample1();
    throwExample();
  }

  public static void throwExample1() {
    try {
      System.out.println("A");
      if (true) { // Sonst "unreachable code".
        throw new IOException("Festplatte abgebrannt.");
      }
      System.out.println("B");
    } catch (IOException e) {
      System.out.println("Fehler: " + e.getMessage());
    }
  }

  public static void throwExample() {
    try {
      System.out.println("A");
      thrower();
      System.out.println("B");
    } catch (IOException e) {
      System.out.println("Fehler: " + e.getMessage());
    }
  }

  private static void thrower() throws IOException {
    throw new IOException("Festplatte explodiert");
  }
}
