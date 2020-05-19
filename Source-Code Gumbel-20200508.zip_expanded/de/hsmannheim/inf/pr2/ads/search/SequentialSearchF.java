package de.hsmannheim.inf.pr2.ads.search;


/**
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SequentialSearchF {

  public static void main(String[] args) {
    new SequentialSearchF();
  }

  public SequentialSearchF() {
    int[] f = {2, 4, 5, 6, 7, 8, 9, 11};
    int key = 8;
    int res = seqSearch(f, key, 0);
    System.out.print("Position: " + res);
  }

  public int NO_KEY = -1; // Konstante, die immer den Wert -1 hat.

  /**
   * @param f   Die zu durchsuchende Folge
   * @param key Der zu findende Schlüssel
   * @param i   aktuelle Suchposition
   * @return Die Position, an der das (erste gefundene) Element steht
   * oder NO_KEY, falls Schlüssel nicht gefunden wird.
   */
  public int seqSearch(int[] f, int key, int i) {
    if (i >= f.length) { // Ende erreicht?
      return NO_KEY; // Element also nicht vorhanden.
    } else {
      if (f[i] == key) { // Element gefunden?
        return i;
      } else {
        return seqSearch(f, key, i + 1); // Suche in Restfolge weiter.
      }
    }
  }
}
