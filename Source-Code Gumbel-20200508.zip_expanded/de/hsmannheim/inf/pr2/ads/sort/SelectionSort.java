package de.hsmannheim.inf.pr2.ads.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Ein SelectionSort.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SelectionSort<E extends Comparable<E>> implements Sort<E> {

  /**
   * @param list Die zu sortierende Liste (wird verändert).
   */
  public void sort(List<E> list, Comparator<E> cmp) {
    // Durchlaufe Positionen n-1 bis 1 rückwärts...
    for (int p = list.size() - 1; p > 0; p--) {
      // Suche größtes Element im Bereich:
      int max = maxSearch(list, 0, p, cmp);
      swap(list, p, max); // Tausche beide Elemente.
    }
  }

  /**
   * @param list Die zu durchsuchende Folge
   * @param i1   Beginn des Suchbereichs
   * @param i2   Ende des Suchbereichs
   * @param cmp  Für den Vergleich.
   * @return Die Position, an der das größte Element steht.
   */
  private int maxSearch(List<E> list, int i1, int i2,
                        Comparator<E> cmp) {
    int m = i1; // Bis jetzt "größtes" Element.
    for (int i = i1 + 1; i <= i2; i++) {
      if (cmp.compare(list.get(i), list.get(m)) > 0) {
        m = i; // Größeres Element gefunden.
      }
    }
    return m;
  }

  // Hilfsfunktion zum Vertauschen zweier Feldelemente:
  private void swap(List<E> list, int idx1, int idx2) {
    E tmp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, tmp);
  }

  @Override
  public String toString() {
    return "Selection sort";
  }
}
