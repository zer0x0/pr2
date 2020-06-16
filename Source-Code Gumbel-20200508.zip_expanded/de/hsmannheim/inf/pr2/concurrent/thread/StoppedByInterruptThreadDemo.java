package de.hsmannheim.inf.pr2.concurrent.thread;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 */
public class StoppedByInterruptThreadDemo {
  public static void main(String[] args) throws Exception {
    Thread thread = new Thread(new StoppableByInterrupt());
    thread.start();
    Thread.sleep(30); // Schlafe 30 ms.
    thread.interrupt(); // Bitte Thread sich zu beenden.
  }
}

class StoppableByInterrupt implements Runnable {

  public void run() {
    try {
      while (!Thread.currentThread().isInterrupted()) {
        System.out.println("Thread laeuft");
        Thread.sleep(10); // Schlafe 10 ms.
      }
    } catch (InterruptedException e) {
      System.out.println("StoppableByInterrupt unterbrochen.");
    }
    System.out.println("** StoppableByInterrupt gestoppt **");
  }
}
