package de.hsmannheim.inf.pr2.ads;

/**
 * Vereinfachtes Queue-Interface. Eine Warteschlange ist ebenfalls ein
 * Container.
 * Enthält nur die Methoden, die für die Vorlesung
 * didaktisch relevant sind.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public interface Queue<E> extends Container<E> {

  /**
   * Reiht das Element in die Warteschlange ein.
   * @param value Element.
   */
  void enter(E value);

  /**
   * Entfernt das (vorderste) Element aus der Warteschlange.
   * @return Entferntes Element.
   */
  E leave();

  /**
   * Gibt das vorderste Element zurück, ohne es zu entfernen.
   * @return Vorderste Element.
   */
  E front();
}
