package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Ein Array, das sich automatisch erweitert.
 * Initial hat dieses Array 100 Plätze.
 * Wird mit setAt() ein Platz mit einem Wert belegt, dessen Index
 * größer als die Länge des aktuellen Array ist, wird das interne Array
 * automatisch um 100 Plätze vergrößert.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ResizableArray<E> implements Container<E> {


  /**
   * Erzeugt ein leeres veränderliches Array.
   * Intern werden 100 Array-Plätze reserviert.
   */
  public ResizableArray() {
    // Bitte fertig ausprogrammieren:
  }

  /**
   * Gibt einen gespeicherten Wert zurück.
   * @param idx Indexposition.
   * @return Wert an Position <code>idx</code> oder
   * null, wenn dort nichts gespeichert ist.
   */
  public E getAt(int idx) {
    // Bitte fertig ausprogrammieren:
    return null;
  }

  /**
   * Überschreibt den Wert an Position <code>idx</code> mit
   * <code>value</code>. Existiert dieser Index nicht,
   * wird das Array entsprechend erweitert.
   * Ist der Wert null, wird das Element an dieser Position
   * gelöscht und das Array ggf. verkleinert.
   *
   * @param idx Indexposition
   * @param e   Wert
   */
  public void setAt(int idx, E e) {
    // Bitte fertig ausprogrammieren:
  }

  /**
   * Überprüft, ob der der Wert <code>e</code> im Array
   * enthalten ist.
   *
   * @param e Gesuchter Wert.
   * @return Wahr, falls mindestens ein Wert enthalten ist,
   * falsch sonst.
   */
  public boolean contains(E e) {
    // Bitte fertig ausprogrammieren:
    return false;
  }

  /**
   * Überprüft, ob das Array Elemente (verschieden von null) enthält.
   *
   * @return Wahr, wenn das Array leer ist, falsch sonst.
   */
  public boolean isEmpty() {
    // Bitte fertig ausprogrammieren:
    return false;
  }

  /**
   * @return Anzahl der Elemente im Array, die verschieden von
   * null sind.
   */
  public int size() {
    // Bitte fertig ausprogrammieren:
    return 0;
  }

  /**
   * Entfernt alle Elemente aus dem veränderlichen Array.
   */
  public void clear() {
    // Bitte fertig ausprogrammieren:
  }

  /**
   * @return Größter Index mit einem gespeicherten Element oder
   * -1, falls Container leer ist.
   */
  public int getMaxIndex() {
    // Bitte fertig ausprogrammieren:
    return -1;
  }

  public Iterator<E> iterator() {
    // Bitte fertig ausprogrammieren:
    return null;
  }

}
