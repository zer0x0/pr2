package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Eine einfach verkettete Liste.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class List<E> implements Container<E> {
  /**
   * Listenkopf.
   */
  protected ListNode<E> head;

  /**
   * Falls bereits ein Element in neuer Liste sein soll.
   *
   * @param value Wert des ersten Elements.
   */
  public List(E value) {
    head = new ListNode(value, null);
  }

  /**
   * Erzeugt eine leere Liste.
   */
  public List() {
	  this.head = null; 
  }

  public void addFirst(E e) {
    if (isEmpty()) {
      head = new ListNode(e); // neuer Head-Knoten.
    } else {
      head = head.addFirst(e);
    }
  }


  /**
   * F�gt ein Element an das Ende der Liste an.
   *
   * @param e Element, das eingef�gt werden soll.
   */
  public void addLast(E e) {
    ListNode<E> node = new ListNode<>(e); // Erzeuge Knoten.
    // Das Ende der Liste suchen:
    ListNode<E> p = head; // Hilfsvariable.
    if (p == null) { // Leere Liste?
      head = node; // Head ist jetzt der neue Knoten.
    } else { // Liste enth�lt Elemente.
      while (p.getTail() != null) { // p am Ende?
        p = p.getTail(); // p wandert weiter.
      }
      p.next = node; // F�ge am Ende an.
    }
  }

  /**
   * �berpr�ft, ob die Liste Elemente enth�lt.
   *
   * @return Wahr, wenn die Liste leer ist, falsch sonst.
   */
  public boolean isEmpty() {
    // Es k�nnte auch �berpr�ft werden, ob size() 0 liefert,
    // dieser Test ist jedoch schneller:
    return head == null;
  }

  /**
   * Entfernt alle Elemente aus der Liste.
   */
  public void clear() {
    head = null;
  }

  /**
   * @return Anzahl der Elemente in der Liste.
   */
  public int size() {
    if (head != null) {
      return head.size();
    } else {
      return 0;
    }
  }

  /**
   * Erzeugt eine (kurze) Textdarstellung der Liste.
   *
   * @return Textdarstellung der Liste.
   */
  public String toString() {
    // Anmerkung: StringBuffer w�re die bessere L�sung.
    String text = "";
    ListNode<E> p = head;
    while (p != null) {
      text += p.toString() + " ";
      p = p.getTail();
    }
    return "( " + text + ") ";
  }

  // --- Einige Methoden sind noch nicht implementiert. ---

  /**
   * @return Der Wert des ersten Elements oder
   * eine ContainerException, wenn die Liste leer ist.
   */
  public E getFirst() {
    // Bitte fertig ausprogrammieren:
    return null;
  }

  /**
   * @return Der Wert des letzten Elements oder
   * eine ContainerException, wenn die Liste leer ist.
   */
  public E getLast() {
    // Bitte fertig ausprogrammieren:
    return null;
  }

  /**
   * Entfernt das erste Element aus der Liste.
   *
   * @return Der Wert des ersten Elements oder
   * eine ContainerException, wenn die Liste leer ist.
   */
  public E removeFirst() {
    // Bitte fertig ausprogrammieren:
    return null;
  }

  /**
   * Entfernt das letzte Element aus der Liste.
   *
   * @return Der Wert des letzten Elements oder
   * eine ContainerException, wenn die Liste leer ist.
   */
  public E removeLast() {
    // Bitte fertig ausprogrammieren:
    return null;
  }

  /**
   * @param idx
   * @return Wert an Position <code>idx</code> oder
   * IndexOutOfBoundsException, wenn der Index ung�ltig ist.
   */
  public E getAt(int idx) {
    // Bitte fertig ausprogrammieren:
    return null;
  }

  /**
   * �berschreibe den Wert an Position <code>idx</code> mit <code>value</code>.
   * Es wird eine Fehlermeldung ausgegeben, wenn <code>idx</code> eine
   * Ung�ltige Position ist.
   *
   * @param idx
   * @param value
   */
  public void setAt(int idx, E value) {
    // Bitte fertig ausprogrammieren:
  }

  /**
   * L�scht alle Elemente mit diesem Wert aus der Liste.
   * @param e Zu l�schender Wert.
   * @return Wahr, falls mindestens ein Element gel�scht wurde
   * oder falsch, wenn nicht.
   */
  public boolean remove(E e) {
    // Bitte fertig ausprogrammieren:
    return false;
  }


  /**
   * L�scht ein Element an der Position idx.
   * @param idx
   * @return
   */
  public E removeAt(int idx) {
    // Bitte fertig ausprogrammieren:
    return null;
  }
  

  /**
   * �berpr�ft, ob der Wert <code>e</code> in der Liste
   * enthalten ist.
   *
   * @param e Suchwert (int, String, etc.)
   * @return wir fangen am Anfang der Liste an 
   */
  public boolean contains(E e) {
    return head.contains(e); 
  }
/**
 * �berpr�ft, ob der Wert in <code>e</code> in der Liste
 * enthalten ist.
 * 
 * @param e Suchwert (int, String, etc.)
 * @return wir fangen am Anfang der Liste an 
 */
  public boolean containsIter(E e) {
	  return head.containsIter(e); 
  }
  /**
   * F�gt eine andere Liste an das Ende dieser Liste an.
   * Achtung! Die angef�gte Liste k�nnte auch weiterhin
   * doppelt verwendet werden. Das wird hier NICHT gemacht,
   * statt dessen wird die urspr�ngliche Liste geleert.
   *
   * @param otherList Die andere Liste.
   */
  public void concat(List<E> otherList) {
    // Bitte fertig ausprogrammieren:
  }
  
  /**
   * Gibt die Elemente der Liste als String aus
   * 
   * @return rekursiver Aufruf 
   */
  
  public String toListString() {
	  return head.toListString(); 
  }

  /**
   * Iterator-Objekt wird erzeugt!
   */
  public Iterator<E> iterator() {
    return new List$ListIterator(this.head); 
  }
  
  public class List$ListIterator implements Iterator <E>{
	  private ListNode<E>listNodeHead;
	  
	  public List$ListIterator(ListNode<E> head) {
		  this.listNodeHead = head; 
	  }

	@Override
	public boolean hasNext() {
		if(this.listNodeHead.next != null) {
			return true; 
		}
		return false;
	}

	@Override
	public E next() {
		return this.listNodeHead.value; 
	}
	  
  }

}
