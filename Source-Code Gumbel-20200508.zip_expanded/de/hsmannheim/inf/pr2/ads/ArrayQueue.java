package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Ein Warteschlange, die intern ein Array nutzt.
 *
 * @author Markus Gumbel
 */

public class ArrayQueue<E> implements Queue<E> {

  // Die Elemente der Warteschlange:
  private Object[] queue = new Object[101];
  // Index des aktuellen Elements für front():
  private int f = 0;
  // Index des nächsten Elements für enter():
  private int e = 0;

  /**
   * Erzeuge eine neue Warteschlange mit der Kapazität 100, d.h sie kann 100
   * Elemente aufnehmen.
   */
  public ArrayQueue() {
  }

  /**
   * Erzeuge eine neue Warteschlange mit der Kapazität size.
   *
   * @param size Kapazität, d.h. wie viele Elemente sie aufnehmen kann.
   */
  public ArrayQueue(int size) {
    queue = new Object[size + 1]; // Ein Element mehr als size.
    // f == e bedeutet: Queue ist leer. Queue darf nur n-1-Elemente
    // aufnehmen, sonst wäre eine volle und leere Queue anhand der
    // o.g. Vereinbarung nicht zu unterscheiden.
  }

  /**
   * Reiht ein neues Element in die Warteschlange ein. Das Element wird ans
   * Ende der Schlange positioniert oder es gibt eine Fehlermeldung, dass die
   * Schlange bereits voll ist.
   *
   * @param value neues Element
   */
  public void enter(E value) {
    // Hat die Queue bereits n-1-Elemente?
    if (size() == queue.length - 1) {
      throw new ContainerException("Queue overflow");
    } else {
      queue[e] = value;
      e = (e + 1) % queue.length;
    }
  }

  /**
   * Entnimmt ein Element aus der Warteschlange. Das Element wird vom Anfang
   * der Schlange genommen.
   *
   * @return Element, das die Schlange verlässt oder -1, wenn Fehler auftritt,
   * dass keine Elemente mehr in der Schlange sind.
   */
  public E leave() {
    if (isEmpty()) {
      throw new ContainerException("Queue underflow");
    } else {
      E i = (E) queue[f];
      queue[f] = -1;
      f = (f + 1) % queue.length;
      return i;
    }
  }

  /**
   * Liest das nächste Element aus der Warteschlange aus (ohne es zu
   * entfernen). Gibt eine Fehlermeldung, wenn die Schlange leer ist.
   *
   * @return Element oder -1 bei Fehlermeldung.
   */
  public E front() {
    if (isEmpty()) {
      throw new ContainerException("Queue underflow");
    } else
      return (E) queue[f];
  }

  public boolean isEmpty() {
    return f == e;
  }

  public void clear() {
    f = e = 0;
  }

  public int size() {
    return ((e - f) + queue.length) % queue.length;
  }

  public boolean contains(Object o) {
    // Noch nicht implementiert!
    return false;
  }

  public Iterator iterator() {
    // Noch nicht implementiert!
    return null;
  }
}
