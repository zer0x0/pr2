package de.hsmannheim.inf.pr2.ads;

/**
 * Ausnahme, wenn etwas in einem Container (Datenstruktur
 * oder auch Sortierverfahren) schief geht.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ContainerException extends RuntimeException {

  public ContainerException(String msg) {
    super(msg);
  }
}
