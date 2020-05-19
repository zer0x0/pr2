package de.hsmannheim.inf.pr2.ads.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Ein Interface, das Sortieren kann.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public interface Sort<E extends Comparable<E>> {

  /**
   * Sortiert die Liste aufsteigend.
   *
   * @param list Die zu sortierende Liste.
   */
  default void sort(List<E> list) {
    // Liefert den Comparator, der dem Comparable entspricht:
    Comparator<E> cmp = E::compareTo;
    sort(list, cmp);
  }

  /**
   * Sortiert die Liste nach dem gegebenem Kriterium.
   *
   * @param list Die zu sortierende Liste.
   * @param cmp  Definiert die Reihenfolge.
   */
  void sort(List<E> list, Comparator<E> cmp);
}
