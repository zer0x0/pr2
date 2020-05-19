package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Eine Prioritäten-Warteschlange basierend auf
 * einem Heap, der intern als Array dargestellt wird.
 * Das kleinste Element hat die höchste Prioriät.
 * Hinweis: sort() liefert ein Object-Array statt ein E-Array
 * zurück. Das lässt sich in Java nicht anders realiseren.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ArrayPriorityQueue<E extends Comparable<E>> implements Queue<E> {
  protected E[] array;
  protected int next = 0; // Indexposition für neue Elemente.

  public ArrayPriorityQueue() {
    this(100);
  }

  public ArrayPriorityQueue(int capacity) {
    array = (E[]) new Comparable[capacity];
  }

  /**
   * Fügt ein Element in die Prioritäten-Warteschlange ein.
   *
   * @param value
   */
  public void enter(E value) {
    if (next >= array.length) { // Voll?
      throw new ContainerException("Heap full.");
    } else {
      int idx = next; // Nächster freier Platz.
      array[next++] = value; // Element wird zunächst hinten angefügt.
      int parentIdx = calcParentIdx(idx);
      while (idx > 0 && array[parentIdx].compareTo(array[idx]) > 0) {
        swap(parentIdx, idx);
        idx = parentIdx;
        parentIdx = calcParentIdx(idx);
      }
    }
  }

  /**
   * Entnimmt ein Element aus der Prioritäten-Warteschlange.
   * Das Element wird vom Anfang der Schlange genommen.
   *
   * @return Element, das die Schlange verlässt oder Exception, wenn
   * keine Elemente mehr in der Schlange sind.
   */
  public E leave() {
    if (isEmpty()) {
      throw new ContainerException("Heap underflow");
    } else {
      E tmp = array[0]; // Erstes Element merken für return.
      next--;
      array[0] = array[next]; // Wurzelelement durch letztes ersetzen.
      array[next] = tmp;
      int idx = 0;
      boolean goOn = true;
      do {
        int lIdx = calcChildIdx(idx, 1); // linker und rechter...
        int rIdx = calcChildIdx(idx, 2); // Nachfolger.

        if (lIdx < next && rIdx < next) { // 2 Nachfolger.
          E lValue = array[lIdx];
          E rValue = array[rIdx];
          if (lValue.compareTo(rValue) < 0) {
            swap(idx, lIdx);
            idx = lIdx;
          } else {
            swap(idx, rIdx);
            idx = rIdx;
          }
        } else if (lIdx >= next && rIdx < next) {
          // Nur rechten Nachfolger:
          swap(idx, rIdx); // Einfach tauschen.
          idx = rIdx;
        } else if (lIdx < next && rIdx >= next) {
          // Nur linken Nachfolger:
          swap(idx, lIdx); // Einfach tauschen.
          idx = lIdx;
        } else {
          goOn = false; // Kein Nachfolger mehr. Ende.
        }
      } while (goOn);
      return tmp;
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
      throw new ContainerException("Heap underflow");
    } else {
      return array[0];
    }
  }

  public boolean isEmpty() {
    return next == 0;
  }

  public void clear() {
    next = 0;
  }

  /**
   * Die Größe des Heaps.
   *
   * @return Wert zwischen 0 und capacity.
   */
  public int size() {
    return next;
  }

  public boolean contains(E o) {
    // Noch nicht implementiert!
    return false;
  }

  public Iterator iterator() {
    // Noch nicht implementiert!
    return null;
  }

  /**
   * Mittels HeapSort wird das interne Array sortiert
   * und eine Kopie davon zurückgegeben. Das
   * Original-Array wird wieder hergestellt, so dass sich
   * die Warteschlange nicht ändert.
   * Da die Prioritäten-Warteschlange einen Min-Heap darstellt,
   * ist das sortierte Array absteigend sortiert.
   *
   * @return
   */
  public E[] sort() {
    int oldNext = next; // Ursprüngliche Größe und ...
    E[] tmpArray = (E[]) new Comparable[oldNext]; // Array merken.
    System.arraycopy(array, 0, tmpArray, 0, size());
    // Jetzt beginnt der eigentliche HeapSort:
    while (!isEmpty()) {
      leave();
    }
    // Internes Array ist das sortierte Array:
    E[] retArray = (E[]) new Comparable[oldNext];
    System.arraycopy(array, 0, retArray, 0, oldNext);
    // Ursprünglichen Heap wieder herstellen:
    System.arraycopy(tmpArray, 0, array, 0, oldNext);
    next = oldNext; // Heap ist wieder hergestellt.
    return retArray;
  }

  protected int calcParentIdx(int idx) {
    if (idx <= 0) {
      return -1;
    } else if (idx % 2 == 0) {
      return idx / 2;
    } else {
      return (idx - 1) / 2;
    }
  }

  protected int calcChildIdx(int idx, int child) {
    if (child == 1) {
      return 2 * (idx + 1) - 1;
    } else {
      return 2 * (idx + 1);
    }
  }

  protected void swap(int idx1, int idx2) {
    E tmp = array[idx1];
    array[idx1] = array[idx2];
    array[idx2] = tmp;
  }
}
