package de.hsmannheim.inf.pr2.misc;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Factorial {

  // Das ist das Hauptprogramm, das gestartet wird:
  public static void main(String[] args) {
    new Factorial(); // Es ruft unser Programm auf.
  }

  public Factorial() {
    int n = 3;
    int fac = fac(n);
    System.out.println("Berechnung fac(" + n + ") = " + fac);
  }

  public int fac(int n) {
    if (n == 0) {
      return 1;
    } else {
      int f = fac(n - 1);
      int res = n * f;
      return res; // auch denkbar: return n * fac(n - 1);
    }
  }
}
