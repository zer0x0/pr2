package de.hsmannheim.inf.pr2.concurrent.sync;


/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SyncLabelGeneratorDemo {

  public static void main(String[] args) throws Exception {
    SyncLabelGenerator gen =
            new SyncLabelGenerator();
    Thread t1 = new Thread(new SyncLabelConsumer("C1", gen));
    Thread t2 = new Thread(new SyncLabelConsumer("C2", gen));
    t1.start();
    t2.start();
  }
}

class SyncLabelConsumer implements Runnable {
  private SyncLabelGenerator gen;
  private String consumerId;

  SyncLabelConsumer(String id, SyncLabelGenerator gen) {
    this.gen = gen;
    consumerId = id;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(gen.next());
    }
  }
}

class SyncLabelGenerator {
  private int number1 = 0; // 1. Teil
  private int number2 = 0; // 2. Teil

  public synchronized String resetAndNext() {
    number1 = 0; // Setze Zähler zurück.
    number2 = 0;
    return next(); // next() ist ebenfalls synchronized!
  }

  public synchronized String next() {
    number1++; // Nächste Zahl des 1. Teils.
    // Berechne etwas, damit der Thread hier irgendwann
    // unterbrochen wird:
    for (int j = 0; j < 100000; j++) {
      double r = Math.sqrt(j);
    }
    number2++; // Nächste Zahl des 2. Teils.
    String no = number1 + "-" + number2;
    return no;
  }
}
