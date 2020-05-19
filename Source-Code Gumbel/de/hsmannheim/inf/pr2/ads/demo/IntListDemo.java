package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.List;

/**
 * Hier wird gezeigt, wie eine Liste mit Beispieldaten gefüllt wird und
 * einige Operation ausgeführt werden.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class IntListDemo {

  public static void main(String[] args) {
    List<Integer> list = new List<>(); // Erzeuge leere Liste.
    list.addLast(1);  // Füge Elemente ein. Ergibt 1.
    list.addLast(2);  // Ergibt 1, 2.
    list.addLast(3);  // Ergibt 1, 2, 3.
    list.addFirst(4); // Ergibt 4, 1, 2, 3.

    System.out.println("list = " + list); // möglich wg. toString().
    System.out.println("Groesse = " + list.size());
    System.out.println("leer? " + list.isEmpty());

    System.out.println("Loesche alle Elemente aus list.");
    list.clear();
    System.out.println("list = " + list); // wg. toString().
    System.out.println("Groesse = " + list.size());
    System.out.println("leer? " + list.isEmpty());

    // Weitere Methoden, die aber nichts bewirken, da sie
    // noch nicht implementiert sind:
    list.removeFirst();
    list.removeLast();
    int a = list.getAt(2);
    // usw.
  }
}
