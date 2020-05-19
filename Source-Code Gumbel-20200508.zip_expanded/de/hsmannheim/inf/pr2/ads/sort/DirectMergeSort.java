package de.hsmannheim.inf.pr2.ads.sort;

import java.util.*;

/**
 * Ein direkter 2-Wege MergeSort, simuliert mit Arrays.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class DirectMergeSort<E extends Comparable<E>> implements Sort<E> {

  /**
   * Sortiere Folge mit direktem 2-Wege MergeSort.
   *
   * @param list Die zu sortierende Folge.
   */
  public void sort(List<E> list, Comparator<E> cmp) {
    if (list.size() <= 1) {
      return; // Höchstens ein Element, es gibt nichts zu sortieren.
    }
    List<E> f1 = new ArrayList<>(); // Erzeuge die Bänder F1
    List<E> f2 = new ArrayList<>(); // und F2.

    int r = 1; // Lauflänge zu Beginn.
    // Solange die Lauflänge kleiner als n ist, ist die Folge
    // möglicherweise noch unsortiert:
    while (r < list.size()) {
      split(list, f1, f2, r); // Teile list in F1 und F2 auf.
      merge(f1, f2, list, r, cmp); // Füge F1 und F2 in F zusammen.
      r = r * 2; // Verdoppele Lauflänge für nächsten Durchlauf.
    }
  }

  /**
   * Teile F in F1 und F2 auf.
   *
   * @param list Originalband
   * @param f1   1. Hilfsband
   * @param f2   2. Hilfsband
   * @param r    Lauflänge
   */
  private void split(List<E> list, List<E> f1, List<E> f2, int r) {
    f1.clear(); // Zunächst werden die Bänder gelöscht.
    f2.clear();

    // true für Band F1 bzw. false für F2:
    boolean firstTape = false; // zunächst F2, wird sofort gewechselt.
    int i = 0; // Zähler zum Bandwechseln.

    for (E e : list) { // Durchlaufe das Band F...
      if (i++ % r == 0) { // Laufende erreicht?
        firstTape = !firstTape; // Ja, d.h. wir wechseln das Band.
      }
      // Füge zu lesendes Element auf F an das aktuelle Band an:
      if (firstTape) {
        f1.add(e);
      } else {
        f2.add(e);
      }
    }
  }

  /**
   * Füge die Läufe auf F1 und F2 nach F zusammen.
   *
   * @param f1   1. Hilfsband
   * @param f2   2. Hilfsband
   * @param list Originalband
   * @param r
   */
  private void merge(List<E> f1, List<E> f2, List<E> list,
                     int r, Comparator<E> cmp) {
    // Anzahl Laufpaare (aufgerundet):
    int noRunPairs = (int) Math.ceil(list.size() / (2.0 * r));
    list.clear(); // Originalband wieder löschen.

    for (int rp = 1; rp <= noRunPairs; rp++) { // Alle Laufpaare...
      int remaining1 = Math.max(0, f1.size() - r);
      int remaining2 = Math.max(0, f2.size() - r);
      while (f1.size() > remaining1 && f2.size() > remaining2) {
        if (cmp.compare(f1.get(0), f2.get(0)) <= 0) {
          list.add(f1.remove(0)); // Element auf F1 kleiner gleich -> angefügt.
        } else {
          list.add(f2.remove(0)); // Element auf F2 größer -> angefügt.
        }
      }
      // Füge den Rest eines etwaigen nicht-leeren Laufs an F an:
      while (f1.size() > remaining1) { // Band F1
        list.add(f1.remove(0));
      }
      while (f2.size() > remaining2) { // Band F2
        list.add(f2.remove(0));
      }
    }
  }
}
