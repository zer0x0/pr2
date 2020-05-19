package de.hsmannheim.inf.pr2.concurrent.thread;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class LambdaThreadDemo {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(
            () -> { // Lambda-Funktion
              while (true) {
                System.out.println("Paraller Thread");
              }
            });
    t.start();

    while (true) {
      System.out.println("Hauptprogramm");
    }
  }
}
