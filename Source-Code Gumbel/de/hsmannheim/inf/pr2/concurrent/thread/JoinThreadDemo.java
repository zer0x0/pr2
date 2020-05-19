package de.hsmannheim.inf.pr2.concurrent.thread;


/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class JoinThreadDemo {
  public static void main(String[] args) throws Exception {
    Thread t1 = new Thread(new RunnerPrinter("Runner 1"));
    Thread t2 = new Thread(new RunnerPrinter("Runner 2"));
    Thread t3 = new Thread(new RunnerPrinter("Runner 3"));

    t1.start(); // Starte alle drei Threads.
    t2.start();
    t3.start();
    t1.join(); // Warte auf t1.
    t2.join(); // Warte auf t2.
    t3.join(); // Warte auf t3.

    System.out.println("Alle fertig.");

  }
}

class RunnerPrinter implements Runnable {
  private String text;

  RunnerPrinter(String text) {
    this.text = text;
  }

  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println(text);
      try {
        Thread.sleep((long) (Math.random() * 10));
      } catch (InterruptedException e) {
        System.out.println(text + " ist unterbrochen.");
      }
    }
    System.out.println(text + " ist fertig.");
  }
}
