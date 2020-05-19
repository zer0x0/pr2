package de.hsmannheim.inf.pr2.misc;


import java.util.Scanner;

/**
 * Hier kann ein Kommentar stehen.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class TestGerade {
  // Das ist das Hauptprogramm, das gestartet wird:
  public static void main(String[] args) {
    new TestGerade(); // Es ruft unser Programm auf.
  }

  public TestGerade() {
    System.out.print("Bitte Zahl eingeben: ");
    int z = readInt(); // Unterprogramm (Funktion).
    int x = z; // Kopie, damit z erhalten bleibt.
    if (x > 0) {
      while (x > 0) {
        x = x - 2;
      }
      if (x == 0) {  // Vergleich ist in Java ==
        System.out.println(z + " ist gerade.");
      } else {
        System.out.println(z + " ist ungerade.");
      }
    } else {
      System.out.println("Nur Zahlen größer 0 sind erlaubt.");
    }
  }

  // Lies eine Integer-Zahl ein:
  private int readInt() {
    return new Scanner(System.in).nextInt();
  }
}
