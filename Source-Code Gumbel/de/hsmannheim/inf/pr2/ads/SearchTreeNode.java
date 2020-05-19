package de.hsmannheim.inf.pr2.ads;

/**
 * Eine TreeNode-Klasse speziell f�r Suchb�ume. Hier sind
 * die Elemente sortierbar (Comparable).
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SearchTreeNode<E extends Comparable<E>>
extends TreeNode<E> {

	/**
	 * Erzeuge einen neuen Bin�rbaum-Knoten.
	 * Nachfolger und Vorg�nger sind nicht gesetzt.
	 *
	 * @param v Der Wert des Knotens.
	 */
	public SearchTreeNode(E v) {
		this(v, null, null);
	}


	/**
	 * Erzeuge einen neuen Bin�rbaum(-Knoten), entspricht tree().
	 *
	 * @param value Der Wert des Knotens.
	 * @param left  Der linke Teilbaum.
	 * @param right Der rechte Teilbaum.
	 */
	public SearchTreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
		super(value, left, right);
	}
}
