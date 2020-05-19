package de.hsmannheim.inf.pr2.concurrent.hazard;

/**
 * Minimales Beispiel für ein Deadlock.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class MinimalDeadLockDemo {

  public static void main(String[] args) throws Exception {
    WaitThread wt1 = new WaitThread();
    WaitThread wt2 = new WaitThread();
    Thread t1 = new Thread(wt1, "t1");
    Thread t2 = new Thread(wt2, "t2");
    wt1.other = t2; // Weise die Threads t1 und t2 über Kreuz zu.
    wt2.other = t1;
    t1.start();
    t2.start();
    Thread.sleep(2000);
    t1.interrupt(); // Jetzt wird das Deadlock aufgelöst.
    System.out.println("Hauptprogramm beendet.");
  }
}

class WaitThread implements Runnable {
  public Thread other; // Referenz auf anderen Thread.

  public void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name + " Start.");
    try {
      other.join(); // Warte auf Ende des anderen Threads.
    } catch (InterruptedException e) {
      System.out.println(name + " unterbrochen");
    }
    System.out.println(name + " Ende.");
  }
}
