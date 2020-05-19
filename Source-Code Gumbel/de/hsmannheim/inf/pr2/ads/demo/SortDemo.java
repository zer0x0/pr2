package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.sort.BubbleSort;
import de.hsmannheim.inf.pr2.ads.sort.InsertionSort;
import de.hsmannheim.inf.pr2.ads.sort.SelectionSort;
import de.hsmannheim.inf.pr2.ads.sort.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Hier werden Integer-Zahlen und Strings mit den besprochenen
 * Sortieralgorithmen sortiert.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SortDemo {

  public static void main(String[] args) {
    doSort(new BubbleSort<>(), getIntList());
    doSort(new InsertionSort<>(), getIntList());
    doSort(new SelectionSort<>(), getIntList());

    doSort(new BubbleSort<>(), getStringList());
    doSort(new InsertionSort<>(), getStringList());
    doSort(new SelectionSort<>(), getStringList());

    // Erzeuge einen aufsteigenden Comparator für Strings:
    Comparator<Integer> iCmp = Comparator.naturalOrder();
    doDescSort(new BubbleSort<>(), getIntList(), iCmp);
    doDescSort(new InsertionSort<>(), getIntList(), iCmp);
    doDescSort(new SelectionSort<>(), getIntList(), iCmp);

    // Erzeuge einen aufsteigenden Comparator für Strings:
    Comparator<String> sCmp = Comparator.naturalOrder();
    doDescSort(new BubbleSort<>(), getStringList(), sCmp);
  }

  /**
   * @return Eine unsortierte Liste von Zahlen.
   */
  public static List<Integer> getIntList() {
    return Arrays.asList(9, 15, 2, 5, 10, 8, 9, 1);
  }

  /**
   * @return Eine unsortierte Liste von Strings.
   */
  public static List<String> getStringList() {
    return Arrays.asList("Ich", "bin", "ein", "Sortierbeispiel.");
  }

  public static <E> void doSort(Sort sortAlg, List<E> list) {
    System.out.println(sortAlg + ":");
    System.out.println("vorher:  " + list.toString());
    sortAlg.sort(list);
    System.out.println("nachher: " + list.toString());
  }

  public static <E> void doDescSort(Sort sortAlg, List<E> list,
                                    Comparator<E> cmp) {
    // Erzeuge absteigenden Comparator:
    Comparator<E> desc = cmp.reversed();

    System.out.println(sortAlg + " desc:");
    System.out.println("vorher:  " + list.toString());
    sortAlg.sort(list, desc);
    System.out.println("nachher: " + list.toString());
  }
}
