package de.hsmannheim.inf.pr2.misc;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Hallo {

  // Das ist das Hauptprogramm, das gestartet wird:
  public static void main(String[] args) {
    new Hallo(); // Es ruft unser Programm auf.
  }

  public Hallo() {
    h(4);
  }

  public void h(int n) {
    if (n > 0) {
      System.out.println("Hallo");
      h(n-1);
    }
    return;
  }
}
