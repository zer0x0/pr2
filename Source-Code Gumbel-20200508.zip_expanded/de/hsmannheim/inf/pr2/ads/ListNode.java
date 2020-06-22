package de.hsmannheim.inf.pr2.ads;

/**
 * Ein Knoten einer verketteten Liste, der beliebige Elemente aufnehmen kann.
 * 
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ListNode<E> {
	/**
	 * Wert, den dieser Knoten aufnimmt.
	 */
	public E value;

	/**
	 * Nachfolger dieses Knotens. null bedeutet: kein Nachfolger.
	 */
	public ListNode<E> next = null;

	// Konstruktoren

	/**
	 * Erzeugt einen neuen Knoten.
	 *
	 * @param value Wert dieses Knotens
	 * @param n     Nachfolger-Knoten
	 */
	public ListNode(E value, ListNode<E> n) {
		this.value = value;
		next = n;
	}

	/**
	 * Erzeugt einen neuen Knoten (neue Liste).
	 *
	 * @param value int-Wert dieses Knotens
	 */
	public ListNode(E value) {
		this.value = value;
	}

	/**
	 * @return Den Wert des ersten Knotens der Liste.
	 */
	public E getHead() {
		return value;
	}

	/**
	 * @return Die Restliste.
	 */
	public ListNode<E> getTail() {
		return next;
	}

	/**
	 * Erzeugt einen neuen Listenknoten und lässt ihn auf diese Liste zeigen.
	 *
	 * @param value Wert des neuen Listenknotens.
	 * @return Die neue Liste mit neuem Knoten am Anfang.
	 */
	public ListNode<E> addFirst(E value) {
		return new ListNode<>(value, this);
	}

	/**
	 * @return Die Anzahl der Elemente in der Liste.
	 */
	public int size() {
		if (getTail() == null) { // Kein Nachfolger-Knoten vorhanden?
			return 1; // Liste hat genau ein Element.
		} else {
			return 1 + getTail().size();
		}
	}

	/**
	 * Gibt das Element auf die Console aus (ohne Zeilenumbruch).
	 */
	public void print() {
		System.out.print(value + " ");
	}

	public String toString() {
		return value + "";
	}

	/**
	 * Gibt die Liste als String aus in Klammern mit Komma
	 * 
	 * @return text
	 */
	public String toListString() {
		String text = "";
		ListNode<E> p = this;
		while (p.next != null) {
			text += p.toString() + ", ";
			p = p.getTail();

		}
		text += p.toString();

		return "(" + text + ") ";
	}

	public static void main(String[] args) {
		List<String> zeichenKetten = new List<String>("Hallo");
		List<Integer> intZahlen = new List<Integer>(1);
		intZahlen.addLast(1);
		intZahlen.addLast(2);
		intZahlen.addLast(3);
		intZahlen.addLast(5);
		intZahlen.addLast(8);

		zeichenKetten.addLast("Welt");
		zeichenKetten.addLast("das");
		zeichenKetten.addLast("Wetter");
		zeichenKetten.addLast("ist");
		zeichenKetten.addLast("schön");

		System.out.println(zeichenKetten.toListString());
		System.out.println(intZahlen.toListString());
		System.out.println(intZahlen.contains(1));
		System.out.println(zeichenKetten.containsIter("Hallo"));
	}

	/**
	 * Überprüft, ob der Wert <code>e</code> in der Liste enthalten ist.
	 *
	 * @param e Suchwert (int, String, etc.)
	 * @return return true wenn Wert gefunden wurde false wenn nicht
	 */
	public boolean containsIter(E e) {
		ListNode<E> current = this;
		while (current != null) {
			if (current.getHead() == e) {
				return true;
			}
			current = current.getTail();
		}
		return false;
	}

	/**
	 * Überprüft, ob der Wert in <code>e</code> in der Liste enthalten ist. Rekursiv
	 * weil wieder aufgerufen in der Funktion bei return getTail().contains(e);
	 * 
	 * @param e Suchwert (int, String, etc.)
	 * @return true wenn Wert gefunden wurde false wenn nicht
	 */
	public boolean contains(E e) {
		if (this.getHead().equals(e)) {
			return true;
		} else if (getTail() != null) {
			return getTail().contains(e);
		}
		return false;
	}
}
