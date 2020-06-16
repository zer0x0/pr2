package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Ein Stack, der auf intern eine verkettete Liste benutzt.
 *
 * @author Markus Gumbel
 */
public class ListStack<E> implements Stack<E> {

  protected List<E> list = new List<>();

  /**
   * Lege eine neue Instanz des Kellerspeichers an.
   */
  public ListStack() {
  }

  /**
   * Entnehme das oberste Element vom Stapel.
   *
   * @return Der Wert des Elements oder -1, wenn der Stack bereits leer ist.
   */
  public E pop() {
    if (isEmpty()) {
      throw new ContainerException("Stack Underflow");
    } else {
      return list.removeFirst();
    }
  }

  /**
   * Lege einen neues Element auf den Stapel.
   *
   * @param value Wert des Elements.
   */
  public void push(E value) {
    list.addFirst(value);
  }

  /**
   * Was ist der Wert des obersten Elements?
   *
   * @return Der Wert des obersten Elements oder -1, wenn der Stack bereits
   * leer ist.
   */
  public E peek() {
    if (isEmpty()) {
      throw new ContainerException("Stack is empty");
    } else
      return list.getFirst();
  }

  public boolean contains(Object o) {
    // Noch nicht implementiert!
    return false;
  }

  public Iterator iterator() {
    // Noch nicht implementiert!
    return null;
  }
  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int size() {
    return list.size();
  }

  public void clear() {
    list.clear();
  }
}
