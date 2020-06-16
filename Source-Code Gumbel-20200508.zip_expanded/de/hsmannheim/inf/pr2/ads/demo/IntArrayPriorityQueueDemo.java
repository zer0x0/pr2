package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.ArrayPriorityQueue;
import de.hsmannheim.inf.pr2.ads.Queue;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 *         (c) 2013 Markus Gumbel
 */
public class IntArrayPriorityQueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new ArrayPriorityQueue<>();

    System.out.println("Größe = " + queue.size());
    queue.enter(3);
    System.out.println("Größe = " + queue.size());
    queue.enter(2);
    System.out.println("Größe = " + queue.size());
    queue.enter(1);
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
