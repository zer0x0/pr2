package de.hsmannheim.inf.pr2.ads;

/**
 * Vereinfachtes Stack-Interface. Ein Stack ist ebenfalls ein
 * Container.
 * Enthält nur die Methoden, die für die Vorlesung
 * didaktisch relevant sind.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public interface Stack<E> extends Container<E> {

  /**
   * Legt das Element auf dem Stack ab.
   * @param value Element.
   */
  void push(E value);

  /**
   * Entfernt das Element vom Stack.
   * @return Entferntes Element.
   */
  E pop();

  /**
   * Gibt das oberste Element zurück, ohne es zu entfernen.
   * @return Oberstes Element.
   */
  E peek();
}
