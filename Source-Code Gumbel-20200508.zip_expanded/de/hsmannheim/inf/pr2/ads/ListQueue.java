package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Ein Warteschlange, die intern eine verkette Liste nutzt.
 * @author Markus Gumbel
 */
public class ListQueue<E> implements Queue<E>  {

  // Direkten Zugriff auf die Liste verbieten:
  private List<E>  list = new List<>();

  /**
   * Erzeuge eine leere Warteschlange.
   */
  public ListQueue() {
  }

  /**
   * Reiht ein neues Element in die Warteschlange ein. Das Element
   * wird ans Ende der Schlange positioniert.
   * @param e neues Element
   */
  public void enter(E e) {
    list.addLast(e); // Füge Element ans Ende der int. Liste an.
  }

  /**
   * Entnimmt ein Element aus der Warteschlange. Das Element wird
   * vom Anfang der Schlange genommen.
   * @return Element, das die Schlange verlässt oder -1, wenn Fehler auftritt,
   * dass keine Elemente mehr in der Schlange sind.
   */
  public E leave() {
    if (isEmpty()) {
      throw new ContainerException("Queue underflow");
    } else {
      return list.removeFirst(); // Front ist der Anfang der int. Liste.
    }
  }
  /**
   * Liest das nächste Element aus der Warteschlange aus (ohne es zu
   * entfernen). Gibt eine Fehlermeldung, wenn die Schlange leer ist.
   * @return Element oder -1 bei Fehlermeldung.
   */
  public E front() {
    if (isEmpty()) {
      throw new ContainerException("Queue underflow");
    } else
      return list.getFirst();
  }

  public boolean isEmpty() {
    return list.isEmpty(); // Delegiere dies weiter an die Liste.
  }

  public void clear() {
    list.clear();  // Delegiere dies weiter an die Liste.
  }

  public int size() {
    return list.size();  // Delegiere dies weiter an die Liste.
  }

  public boolean contains(E o) {
    return list.contains(o);
  }

  public Iterator iterator() {
    return list.iterator();
  }
}
