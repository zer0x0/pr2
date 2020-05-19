package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.ListQueue;
import de.hsmannheim.inf.pr2.ads.Queue;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
class IntQueueDemo {

  public static void main(String[] args) {

    // Erzeuge Warteschlange mit Kapazität von max. 3 Elementen:
    // Queue queue = new ArrayQueue(3);

    // oder

    // Erzeuge Warteschlange mit Kapazität von max. 3 Elementen:
    Queue<Integer> queue = new ListQueue<>();

    System.out.println("Größe = " + queue.size());
    queue.enter(1);
    System.out.println("Größe = " + queue.size());
    queue.enter(2);
    System.out.println("Größe = " + queue.size());
    queue.enter(3);
    System.out.println("Größe = " + queue.size());

    // Fehlermeldung:
    queue.enter(4);

    System.out.println("Nächstes: " + queue.leave());
    System.out.println("Größe = " + queue.size());

    queue.enter(4);
    System.out.println("Größe = " + queue.size());

    while (!queue.isEmpty()) {
      int i = queue.leave();
      System.out.println("Nächstes: " + i);
    }
    // Fehlermeldung:
    queue.leave();
  }
}
