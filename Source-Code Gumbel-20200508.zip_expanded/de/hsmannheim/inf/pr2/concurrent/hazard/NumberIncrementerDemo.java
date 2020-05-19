package de.hsmannheim.inf.pr2.concurrent.hazard;

import java.util.Arrays;
import java.util.List;

/**
 * Haupklasse.
 */
public class NumberIncrementerDemo {

  /**
   * Start-Methode.
   *
   * @param args Kommandozeilenargumente.
   */
  public static void main(String[] args) {

    NumberList numbers = new NumberList();

    // Threads anlegen:
    List<Thread> threads = Arrays.asList(
            new Thread(new NumberIncrementer(100000, numbers)),
            new Thread(new NumberIncrementer(100000, numbers)),
            new Thread(new NumberIncrementer(100000, numbers))
    );

    for (Thread t : threads) { // Threads starten.
      t.start();
    }

    for (Thread t : threads) { // Auf Ende der Threads warten.
      try {
        t.join();
      } catch (InterruptedException e) {
        // ignore
      }
    }
    numbers.check(); // Zahlen überprüfen.
  }
}
