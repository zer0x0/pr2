package de.hsmannheim.inf.pr2.misc;


/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Pow {

  // Das ist das Hauptprogramm, das gestartet wird:
  public static void main(String[] args) {
    new Pow(); // Es ruft unser Programm auf.
  }

  public Pow() {
    pow(2, 4);
  }

  public int pow(int a, int b) {
    int r = 1;
    for (int i = 1; i <= b; i++) {
      r = r * a;
    }
    return r;
  }
}
