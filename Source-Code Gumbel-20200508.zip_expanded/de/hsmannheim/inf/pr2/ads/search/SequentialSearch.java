package de.hsmannheim.inf.pr2.ads.search;

import java.util.Scanner;

/**
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 *
 * @author Markus Gumbel
 */
public class SequentialSearch {

  public static void main(String[] args) {
    new SequentialSearch();
  }

  public SequentialSearch() {
    int[] f = {2, 4, 5, 6, 7, 8, 9, 11};
    System.out.print("Suchschlüssel = ");
    int key = readInt(); // Schlüssel einlesen.
    int res = seqSearch(f, key);
    System.out.print("Position: " + res);
  }

  public int NO_KEY = -1; // Konstante, die immer den Wert -1 hat.

  /**
   * @param f   Die zu durchsuchende Folge
   * @param key Der zu findende Schlüssel
   * @return Die Position, an der das (erste gefundene) Element steht
   * oder NO_KEY, falls Schlüssel nicht gefunden wird.
   */
  public int seqSearch(int[] f, int key) {
    for (int i = 0; i < f.length; i++) {
      if (f[i] == key) {
        return i;
      }
    }
    return NO_KEY;
  }

  // Lies eine Integer-Zahl ein:
  private int readInt() {
    return new Scanner(System.in).nextInt();
  }
}
