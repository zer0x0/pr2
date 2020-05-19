package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Ein Stack, der intern ein Array benutzt.
 *
 * @author Markus Gumbel
 */
public class ArrayStack<E> implements Stack<E> {

  protected E[] stack;
  private int next = 0; // Nächster freier Platz (= Anzahl).

  public ArrayStack(int capacity) {
    stack = (E[]) new Object[capacity];
  }

  public ArrayStack() {
    this(100);
  }

  public void push(E value) {
    if (next >= stack.length) {
      throw new ContainerException("Stack overflow");
    } else {
      stack[next++] = value;
    }
  }

  public E pop() {
    if (isEmpty()) {
      throw new ContainerException("Stack underflow");
    } else {
      return stack[--next];
    }
  }

  public E peek() {
    if (isEmpty()) {
      throw new ContainerException("Stack is empty");
    } else {
      return stack[next - 1];
    }
  }

  public boolean contains(Object o) {
    // Noch nicht implementiert!
    return false;
  }

  public Iterator iterator() {
    // Noch nicht implementiert!
    return null;
  }

  public int size() {
    return next;
  }

  public boolean isEmpty() {
    return next == 0;
  }

  public void clear() {
    next = 0;
  }
}
