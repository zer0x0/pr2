package de.hsmannheim.inf.pr2.concurrent.thread;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 */
public class StoppedByFlagThreadDemo {

  public static void main(String[] args) throws Exception {
    StoppableByFlag st = new StoppableByFlag();
    Thread thread = new Thread(st);
    thread.start();
    Thread.sleep(30); // Schlafe 30 ms.
    st.requestTermination(); // Bitte Thread sich zu beenden.
  }
}

class StoppableByFlag implements Runnable {
  private volatile boolean cont = true;

  public void requestTermination() {
    cont = false;
  }

  public void run() {
    try {
      while (cont) {
        System.out.println("Thread laeuft");
        Thread.sleep(10); // Schlafe 10 ms.
      }
    } catch (InterruptedException e) {
      System.out.println("StoppableByFlag unterbrochen.");
    }
    System.out.println("** StoppableByFlag gestoppt **");
  }
}
