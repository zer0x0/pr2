package de.hsmannheim.inf.pr2.ads.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Ein einfacher BubbleSort.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class BubbleSort<E extends Comparable<E>> implements Sort<E> {


  /**
   * @param list Die zu sortierende Liste (wird verändert).
   */
  public void sort(List<E> list, Comparator<E> cmp) {
    for (int j = 1; j <= list.size() - 1; j++) {
      for (int i = 0; i <= (list.size() - 1) - j; i++) {
        if (cmp.compare(list.get(i), list.get(i + 1)) > 0) {
          swap(list, i, i + 1); // Tausche Elemente.
        }
      }
    }
  }


  /**
   * Hilfsprozedur zum Vertauschen zweier Listen-Elemente.
   *
   * @param list List mit Elementen, die vertauscht werden sollen.
   * @param idx1 1. Element.
   * @param idx2 2. Element.
   */
  private void swap(List<E> list, int idx1, int idx2) {
    E tmp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, tmp);
  }

  @Override
  public String toString() {
    return "Bubble sort";
  }
}
