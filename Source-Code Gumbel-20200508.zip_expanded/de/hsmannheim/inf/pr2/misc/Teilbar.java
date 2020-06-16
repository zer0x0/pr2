package de.hsmannheim.inf.pr2.misc;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Teilbar {

  public static void main(String[] args) {
    new Teilbar();
  }

  public Teilbar() {
    int x = 100;
    do {
      x++;
    } while (x % 7 != 0);
    System.out.println("Die Zahl ist " + x);
  }
}
