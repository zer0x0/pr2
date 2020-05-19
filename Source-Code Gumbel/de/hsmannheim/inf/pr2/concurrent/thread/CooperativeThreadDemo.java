package de.hsmannheim.inf.pr2.concurrent.thread;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class CooperativeThreadDemo {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(new CooperativeRunner());
    t.start(); // Starte diesen Thread.

    while (true) {
      System.out.println("Hauptprogramm");
      Thread.yield(); // Unterbreche Ausführung.
    }
  }
}

class CooperativeRunner implements Runnable {
  public void run() {
    while (true) {
      System.out.println("Paralleler Thread");
      Thread.yield(); // Unterbreche Ausführung.
    }
  }
}

