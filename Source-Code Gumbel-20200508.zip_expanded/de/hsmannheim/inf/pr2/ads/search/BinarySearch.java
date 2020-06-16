package de.hsmannheim.inf.pr2.ads.search;


/**
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 *
 * @author Markus Gumbel
 */

public class BinarySearch {

  /**
   * Hauptprogramm, das von der Java Virtual Machine gestartet wird.
   *
   * @param args Ihre Kommandozeilen-Parameter
   */
  public static void main(String[] args) {
    new BinarySearch();
  }

  BinarySearch() {
    int[] f = {0, 1, 2, 4, 5, 8, 9, 12, 13, 18};
    int position = binarySearch(f, 8);
    System.out.println("Schlüssel 8 an Position: " + position);
  }

  int NO_KEY = -1; // Konstante, die immer den Wert -1 hat.

  /**
   * @param f   Die zu durchsuchende Folge
   * @param key Der zu findende Schlüssel
   * @return Die Position, an der das (erste gefundene) Element steht oder
   * NO_KEY, falls Schlüssel nicht gefunden wird.
   */
  int binarySearch(int[] f, int key) {
    int i1 = 0, i2 = f.length - 1;
    while (i1 <= i2) {
      int m = (i1 + i2) / 2; // Mitte der Folge.
      if (key == f[m]) {
        return m; // Gefunden!
      } else if (key < f[m]) {
        i2 = m - 1; // Suche in der unteren Hälfte weiter.
      } else {
        i1 = m + 1; // Suche in der oberen Hälfte weiter.
      }
    }
    return NO_KEY; // Suche erfolglos.
  }
}
