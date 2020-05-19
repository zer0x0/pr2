package de.hsmannheim.inf.pr2.concurrent.sync;

/**
 * Das Problem des essenden Philosophen.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class DiningPhilosophersDemo {
  public static void main(String[] args) throws Exception {
    int N = 5; // Anzahl Philosophen.
    Table table = new Table(N); // Tisch mit N Gabeln.
    for (int i = 0; i < N; i++) { // Aktiviere N Philosophen...
      // Parameter: linke u. rechte Gabel sowie der Tisch:
      Philospher p = new Philospher(i, (i + 1) % N, table);
      Thread t = new Thread(p);
      t.start();
    }
    // #ID DiningPhilosophersDemo
  }
}

class Table {
  private boolean[] forks;

  public Table(int N) {
    // Initialisiere Array der Länge N mit true:
    forks = new boolean[N];
    for (int i = 0; i < forks.length; i++) {
      forks[i] = true; // true: Gabel liegt auf dem Tisch.
    }
  }

  public boolean isForkAvailable(int f) {
    return forks[f];
  }

  public void takeFork(int f) {
    forks[f] = false; // false: Gabel hat ein Philosoph.
  }

  public void putFork(int f) {
    forks[f] = true; // Gabel liegt wieder auf dem Tisch.
  }
}

class Philospher implements Runnable {

  private int leftFork, rightFork; // Linke u. rechte Gabel.
  private int philId; // Eindeutige Nr. für den Philosophen.
  private Table table; // Sein Tisch.

  Philospher(int leftFork, int rightFork, Table table) {
    this.leftFork = leftFork;
    this.rightFork = rightFork;
    this.table = table;
    this.philId = leftFork + 1; // Id von 1 bis N.
  }

  public void run() {
    while (true) { // Philosophen denken und essen für immer...
      System.out.println(philId + " denkt."); // Nachdenken.
      try {
        Thread.sleep((int) (Math.random() * 500));
      } catch (InterruptedException e) {
      }
      synchronized (table) { // Greife exklusiv auf den Tisch zu.
        while (!(table.isForkAvailable(leftFork) &&
                table.isForkAvailable(rightFork))) {
          try {
            // Es sind (noch) nicht beide Gabel verfügbar.
            table.wait(); // Warte, bis sich etwas am Tisch ändert.
          } catch (InterruptedException e) {
          }
        }
        table.takeFork(leftFork); // Nimm beide Gabeln.
        table.takeFork(rightFork);
      }
      System.out.println(philId + " isst."); // Essen.
      try {
        Thread.sleep((int) (Math.random() * 300));
      } catch (InterruptedException e) {
      }
      synchronized (table) {
        table.putFork(leftFork); // Leg beide Gabeln zurück.
        table.putFork(rightFork);
        table.notifyAll(); // Teile Änderung mit.
      }
    }
  }
}
