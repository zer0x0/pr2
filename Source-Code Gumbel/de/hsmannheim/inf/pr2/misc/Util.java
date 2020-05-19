package de.hsmannheim.inf.pr2.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Die obligatorischen Hilfsroutinen.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Util {

  /**
   * Hilfsprozedur zum Vertauschen zweier Listen-Elemente.
   *
   * @param list List mit Elementen, die vertauscht werden sollen.
   * @param idx1 1. Element.
   * @param idx2 2. Element.
   */
  public static <E> void swap(List<E> list, int idx1, int idx2) {
    E tmp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, tmp);
  }

  /**
   * In vielen Algorithmen benötigen wir Listen, die veränderlich
   * sind. Arrays.asList() liefert keine vollständige List zurück.
   * Beispielsweise ist clear() hier nicht erlaubt
   * (UnsupportedOperationException). Deshalb erzeugen hiermit
   * eine echte ArrayList.
   * @param elements
   * @return
   */
  public static <E> List<E> asMutualList(E... elements) {
    return new ArrayList<>(Arrays.asList(elements));
  }
}
