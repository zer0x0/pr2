package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.ArrayQueue;
import de.hsmannheim.inf.pr2.ads.Queue;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 *         (c) 2013 Markus Gumbel
 */
class IntArrayQueueDemo {

  public static void main(String[] args) {
    // Beachten Sie: Sie könnten hier ArrayQueue mit
    // ListQueue austauschen und das Programm läuft trotzdem:
    // Queue queue = new ListQueue();
    Queue<Integer> queue = new ArrayQueue<>();

    System.out.println("Größe = " + queue.size());
    queue.enter(1);
    System.out.println("Größe = " + queue.size());
    queue.enter(2);
    System.out.println("Größe = " + queue.size());
    queue.enter(3);
    System.out.println("Größe = " + queue.size());

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
