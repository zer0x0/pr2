package de.hsmannheim.inf.pr2.misc;

import java.util.Scanner;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class GeradeZahlen {

  // Das ist das Hauptprogramm, das gestartet wird:
  public static void main(String[] args) {
    new GeradeZahlen(); // Es ruft unser Programm auf.
  }

  public GeradeZahlen() {
    System.out.print("n eingeben:");
    int n = readInt(); // Unterprogramm (Funktion).
    for (int z = 1; z <= n; z++) {
      if (z % 2 == 0) {
        System.out.println(z);
      }
    }
    System.out.println("Fertig!");
  }

  // Lies eine Integer-Zahl ein:
  private int readInt() {
    return new Scanner(System.in).nextInt();
  }
}
