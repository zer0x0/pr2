package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.ListQueue;
import de.hsmannheim.inf.pr2.ads.Queue;

/**
 * Ein Beispiel für die Anwendung einer Queue, die intern eine
 * Liste benutzt. Achtung! Wenn nicht alle Methoden in de.hsmannheim.inf.pr2.coll.List implementiert
 * sind, funktioniert das Beispiel nicht.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 *         (c) 2013 Markus Gumbel
 */
class IntListQueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new ListQueue<>();

    System.out.println("Größe = " + queue.size()); // = 0.
    queue.enter(1);
    System.out.println("Größe = " + queue.size()); // = 1.
    queue.enter(2);
    System.out.println("Größe = " + queue.size()); // = 2.
    queue.enter(3);
    System.out.println("Größe = " + queue.size()); // = 3.

    System.out.println("Nächstes: " + queue.leave()); // 1.
    System.out.println("Größe = " + queue.size()); // = 2.

    queue.enter(4); // Ergibt Elemente: 2, 3, 4.
    System.out.println("Größe = " + queue.size()); // = 3.

    while (!queue.isEmpty()) {
      int i = queue.leave(); // ... in der Reihenfolge 2, 3, 4.
      System.out.println("Nächstes: " + i);
    }
    queue.leave(); // Fehlermeldung, weil die Warteschlange leer ist.
  }
}
