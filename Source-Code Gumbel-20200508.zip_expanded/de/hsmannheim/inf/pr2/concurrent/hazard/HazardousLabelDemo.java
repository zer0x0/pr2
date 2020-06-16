package de.hsmannheim.inf.pr2.concurrent.hazard;


/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class HazardousLabelDemo {

  public static void main(String[] args) throws Exception {
    LabelGenerator gen = new LabelGenerator(); // Genau eine Instanz.
    Thread t1 = new Thread(new LabelConsumer("C1", gen));
    Thread t2 = new Thread(new LabelConsumer("C2", gen));
    t1.start();
    t2.start();
  }
}

class LabelConsumer implements Runnable {
  private LabelGenerator gen;
  private String consumerId;

  LabelConsumer(String id, LabelGenerator gen) {
    this.gen = gen;
    consumerId = id;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(consumerId + ": " + gen.next());
    }
  }
}

class LabelGenerator {
  private int number1 = 0; // 1. Teil
  private int number2 = 0; // 2. Teil

  public String next() {
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
