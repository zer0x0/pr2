package de.hsmannheim.inf.pr2.ads.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Ein einfacher Insertion-Sort-Algorithmus.
 *
 * @author Markus Gumbel
 */
public class InsertionSort<E extends Comparable<E>> implements Sort<E> {

  /**
   * @param list Die zu sortierende Folge
   */
  public void sort(List<E> list, Comparator<E> cmp) {
    for (int i = 1; i < list.size(); i++) {
      int j = i;
      E m = list.get(i); // Einzufügender Wert.
      // Verschiebe alle größeren Elemente nach rechts:
      while (j > 0 && cmp.compare(list.get(j - 1), m) > 0) {
        list.set(j, list.get(j - 1)); // Vorgänger auf Nachfolger kopiert.
        j--; // j zeigt auf das zu überschreibende Feld.
      }
      list.set(j, m); // Setze m auf das freie Feld.
    }
  }

  @Override
  public String toString() {
    return "Insertion sort";
  }
}
