package de.hsmannheim.inf.pr2.ads;

import java.util.Iterator;

/**
 * Ein bin�rer Suchbaum.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SearchTree<E extends Comparable<E>> implements Set<E> {

	protected SearchTreeNode<E> root; // Wurzelknoten dieses Suchbaums.


	/**
	 * F�ge einen Wert in den Baum hinzu. Das geht nur, wenn dieser
	 * Wert noch nicht enthalten ist.
	 *
	 * @param o Einzuf�gendes Objekt.
	 * @return True, wenn Wert hinzugef�gt wurde, oder false, wenn nicht,
	 * da dieser schon vorhanden war.
	 */
	public boolean add(E o) {
		// Strategie: Wir suchen den Knoten, der nach dem Einf�gen des neues
		// Elements der Elternknoten ist.

		TreeNode<E> parent = null; // (Vorl�ufiger) Elternknoten
		TreeNode<E> node = root; // (Vorl�ufiger) Kindknoten

		// Solange der aktuelle Kindknoten nicht null ist...
		while (node != null) {
			// Setze alten Kindknoten als neuen Elternknoten:
			parent = node;
			// Ist der Wert bereits in diesem Knoten gespeichert?
			if (node.getValue().equals(o)) {
				return false; // Ja, also kann er nicht nochmal eingef�gt werden.
			} else if (o.compareTo(node.getValue()) < 0) {
				// Der einzuf�gende Wert ist kleiner als der aktuelle Knoten.
				node = node.getLeft(); // D.h. suche im linken Teilbaum weiter.
			} else {
				// Der einzuf�gende Wert ist gr��er als der aktuelle Knoten.
				node = node.getRight(); // D.h. suche im rechten Teilbaum weiter.
			}
		}
		// Erzeuge den neuen Knoten f�r den einzuf�genden Wert:
		SearchTreeNode<E> newNode = new SearchTreeNode<>(o);
		if (parent == null) {
			// Kein Elternknoten gefunden. D.h. Baum ist leer.
			root = newNode; // Neuer Knoten wird Wurzelelement.
		} else if (o.compareTo(parent.getValue()) < 0) {
			// Hier wird festgestellt, ob der neue Knoten der rechte oder linke
			// Nachfolger des Elternknotens ist.
			parent.left = newNode; // In diesem Fall links.
		} else {
			parent.right = newNode; // Dito f�r rechts.
		}
		return true; // Neuer Wert konnte erfolgreich eingef�gt werden.
	}


	/**
	 * Suche ein Element in dem Baum.
	 *
	 * @param o Objekt bzw. Suchschl�ssel
	 * @return Wahr, wenn Wert im Baum vorhanden ist, falsch sonst.
	 */
	//	  public boolean contains(E o) {
	//	    // Iterative Variante
	//	    TreeNode<E> n = root; // Erzeuge Zeiger, der bei root beginnt.
	//	
	//	    while (n != null) {
	//	      if (n.getValue().equals(o)) {
	//	        return true; // Element gefunden.
	//	      } else if (o.compareTo(n.getValue()) < 0) {
	//	        // Suchschlüssel kleiner, also im linken Teilbaum weitersuchen.
	//	        n = n.getLeft();
	//	      } else {
	//	        // Suchschlüssel größer, also im rechtenTeilbaum weitersuchen.
	//	        n = n.getRight();
	//	      }
	//	    }
	//	    return false;     // Suche zu Ende, Wert nicht gefunden.
	//	  }
	/**
	 * @param o zu �berpr�fender Wert
	 * @return rekursiver Aufruf von contains(E o, TreeNode<E> n)
	 */
	public boolean contains(E o) {
		return contains(o, this.root); 
	}

	/**
	 * 
	 * @param o zu �berpr�fender Wert
	 * @param n Knoten
	 * @return wahr wenn der Wert gefunden wurde
	 * false wenn nicht 
	 */
	private boolean contains(E o, TreeNode<E> n) {
		if(n == null) {
			return false;
		}
		if(n.getValue() == o) {
			return true; 
		}else {
			if(n.getLeft() != null) {
				return contains(o, n.getLeft()); 
			}if(n.getRight() != null) {
				return contains(o, n.getRight()); 
			}return false; 
		}

	}

	public static void main(String[] args) {
		//		SearchTree<Integer> st = new SearchTree<Integer>(); 
		//		st.add(1); 
		//		TreeNode<Integer> intNode = st.root;
		//
		//	        intNode.left = new SearchTreeNode<Integer>(2); 
		//	        intNode.left.left = new SearchTreeNode<Integer>(4);
		//	        intNode.right = new SearchTreeNode<Integer>(3);
		//	        intNode.right.right = new SearchTreeNode<Integer>(6);

		SearchTree<Integer> t1 = new SearchTree<Integer>();
		t1.add(1); 
		t1.add(2); 
		t1.add(3); 

		System.out.println(t1.height());


		SearchTree<Integer> t2 = new SearchTree<Integer>();
		t2.add(10); 
		System.out.println(t2.height());
		//		st.printInorder(); 
		//		
		//		System.out.println(st.contains(3)); 

		//		System.out.println(st.height());
		//		System.out.println(st.root.getLeft());
	}


	/**
	 * Entfernt einen Knoten mit dem Wert o aus dem Baum.
	 *
	 * @param o Objekt/Schl�ssel, der entfernt werden soll
	 * @return True, falls Element entfernt wurde, false sonst.
	 */
	public boolean remove(E o) {
		// Noch nicht implementiert. Achtung: aufw�ndig!
		return false;
	}


	/**
	 * @return Anzahl der Elemente in dem Baum.
	 */
	public int size() {
		if (isEmpty()) { // Sonderfall leerer Baum beachten!
			return 0; // Leerer Baum hat Gr��e 0.
		} else {
			return root.size(); // Nimm Gr��e des fkt. Baums.
		}
	}


	/**
	 * �berpr�ft, ob der Baum Elemente enth�lt.
	 *
	 * @return Wahr, wenn der Baum leer ist, falsch sonst.
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Entfernt alle Elemente aus dem Baum.
	 */
	public void clear() {
		root = null; 
	}


	/**
	 * Bestimme die H�he des Baums.
	 *
	 * @return H�he rekursiv
	 */
	public int height() {
		return root.height(); 
	}

	public void printInorder() {
		if (!isEmpty()) {
			root.printInorder();
		}
	}

	public Iterator<E> iterator() {
		// Noch nicht implementiert.
		return null;
	}

}

