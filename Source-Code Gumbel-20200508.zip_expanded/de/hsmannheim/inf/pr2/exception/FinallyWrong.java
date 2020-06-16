package de.hsmannheim.inf.pr2.exception;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class FinallyWrong {

  public static boolean f() {
    try {
      return true;
    } finally {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(f());
  }
}
