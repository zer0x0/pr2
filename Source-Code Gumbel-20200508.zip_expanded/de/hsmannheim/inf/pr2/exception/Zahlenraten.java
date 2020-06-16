package de.hsmannheim.inf.pr2.exception;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Ein simples Zahlenraten-Spiel.
 * Hinweis: Dieser Sourcecode ist aus einer Übungsaufgabe und
 * noch nicht komplett.
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public final class Zahlenraten {

  /**
   * Liest einen String von der Tastatur.
   *
   * @return der gelesene String
   * @throws IOException Probleme mit der Console
   */
  private static String readNumber() throws IOException {
    return new Scanner(System.in).next();
  }

  /**
   * Hauptmethode.
   *
   * @param args Kommandozeilenargumente
   * @throws NumberFormatException Fehler bei der Zahlenkonvertierung
   * @throws IOException           I/O-Fehler
   */
  public static void main(String[] args)
          throws NumberFormatException, IOException {

    // Zu ratende Zahl bestimmen:
    int zahl = new Random().nextInt(100) + 1;

    int versuche = 0;

    while (true) {
      System.out.print("Bitte geben Sie eine Zahl ein: ");
      int geraten = Integer.parseInt(readNumber());
      versuche++;

      if (geraten < zahl) {
        System.out.println("Zu niedrig");
      } else if (geraten > zahl) {
        System.out.println("Zu hoch.");
      } else {
        System.out.printf("Richtig in %d Versuchen", versuche);
        break;
      }
    }
  }
}
