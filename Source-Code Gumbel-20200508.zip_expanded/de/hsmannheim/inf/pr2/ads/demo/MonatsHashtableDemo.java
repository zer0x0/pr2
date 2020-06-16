package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.Hashtable;

/**
 * Eine einfache Hashtable für Monatsnamen mit linearen Sondieren.
 * Hinweis: Löschen funktioniert nur, wenn dies in Hashtable
 * ausprogrammiert wurde.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */

public class MonatsHashtableDemo {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Definiere alle Monate:
    Monat[] elements = {
            new Monat("Januar"), new Monat("Februar"),
            new Monat("Maerz"), new Monat("April"),
            new Monat("Mai"), new Monat("Juni"),
            new Monat("Juli"), new Monat("August"),
            new Monat("September"), new Monat("Oktober"),
            new Monat("November"), new Monat("Dezember")
    };
    // ...und füge diese ein:
    Hashtable<Monat> hashtable = new Hashtable<>(17);
    for (Monat monat : elements) {
      hashtable.add(monat);
    }
    System.out.println(hashtable.mkString());

    // Ein paar Testwerte, die überprüft werden sollen:
    Monat[] testContains = {
            new Monat("Februar"),
            new Monat("Oktober"),
            new Monat("Faschingsfebruar")
    };
    for (int i = 0; i < testContains.length; i++) {
      boolean contains = hashtable.contains(testContains[i]);
      if (contains == true) {
        System.out.println(testContains[i] + " ist enthalten");
      } else {
        System.out.println(testContains[i] + " ist *nicht* enthalten");
      }
    }

    // Lösche Februar, der eine Kollision mit August
    // verursacht. Trotzdem sollte Oktober gefunden werden:
    boolean remove1 = hashtable.remove(new Monat("Februar"));
    boolean remove2 = hashtable.remove(new Monat("Februar"));
    System.out.println("\nLösche Februar: 1. Löschen: " + remove1 + "" +
            ", 2. Löschen: " + remove2);
    System.out.println(hashtable.mkString());
    for (int i = 0; i < testContains.length; i++) {
      boolean contains = hashtable.contains(testContains[i]);
      if (contains == true) {
        System.out.println(testContains[i] + " ist enthalten");
      } else {
        System.out.println(testContains[i] + " ist *nicht* enthalten");
      }
    }

    System.out.println("\nFüge Februar wieder hinzu");
    hashtable.add(new Monat("Februar"));
    System.out.println(hashtable.mkString());

    // Alles entfernen und wieder hinzufügen.
    // Das ist ein Rehashing mit schlechter Laufzeit.
    System.out.println("\nLösche alles");
    for (Monat e : elements) {
      hashtable.remove(e);
    }
    System.out.println(hashtable.mkString());
    System.out.println("\nFüge alles hinzu");
    for (Monat e : elements) {
      hashtable.add(e);
    }
    System.out.println(hashtable.mkString());
  }
}
