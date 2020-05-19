package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.Hashtable;

public class IntHashtableDemo {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Hashtable<Integer> hashtable = new Hashtable<>(10);
    int[] elements = {10, 21, 10, 2, 6, 9, 20, 29};
    for (int i = 0; i < elements.length; i++) {
      boolean result = hashtable.add(elements[i]);
      if (result == false) {
        System.out.println(elements[i] +
                " konnte nicht hinzugefuegt werden.");
      }
    }
    System.out.println(hashtable.mkString());

    int[] test = {21, 7, 2};
    for (int i = 0; i < test.length; i++) {
      boolean contains = hashtable.contains(test[i]);
      if (contains == true) {
        System.out.println(test[i] + " ist enthalten.");
      } else {
        System.out.println(test[i] + " ist nicht enthalten.");
      }
    }
  }
}
