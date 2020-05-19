package de.hsmannheim.inf.pr2.concurrent.thread;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SimpleThreadDemo {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(new Runner());
    t.start(); // Starte diesen Thread.

    while (true) {
      System.out.println("Hauptprogramm");
    }
  }
}

class Runner implements Runnable {
  public void run() {
    while (true) {
      System.out.println("Paralleler Thread");
    }
  }
}
