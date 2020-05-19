package de.hsmannheim.inf.pr2.ads.search;


/**
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 *
 * @author Markus Gumbel
 */

public class MaxSearch {

  /**
   * Hauptprogramm, das von der Java Virtual Machine gestartet wird.
   *
   * @param args Ihre Kommandozeilen-Parameter
   * @throws Exception Diese Programm darf Execptions (Ausnahmen) erzeugen.
   */
  public static void main(String[] args) {
    new MaxSearch();
  }

  public MaxSearch() {
    int[] f = {5, 4, 3, 1, 6, 9, 2, 8, 11, 5};
    int position = maxSearch(f);
    System.out.println("Größtes Element an Position: " + position);
  }


  /**
   * @param f Die zu durchsuchende Folge
   * @return Die Position, an der das größte Element steht.
   */
  public int maxSearch(int[] f) {
    int m = 0;
    for (int i = 1; i < f.length; i++) {
      if (f[i] > f[m]) {
        m = i;
      }
    }
    return m;
  }
}
