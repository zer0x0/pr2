package de.hsmannheim.inf.pr2.ads;


/**
 * Ein Knoten f�r einen Bin�rbaum.
 * Dieser Knoten kann selbst als eigener Bin�rbaum aufgefasst werden.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class TreeNode<E> {

	protected E value = null;           // Wert des Knotens.
	protected TreeNode<E> left = null;  // Linker Teilbaum.
	protected TreeNode<E> right = null; // Rechter Teilbaum.

	/**
	 * Erzeuge einen neuen Bin�rbaum-Knoten. Nachfolger und Vorg�nger sind nicht
	 * gesetzt.
	 *
	 * @param v Der Wert des Knotens.
	 */
	public TreeNode(E v) {
		value = v;
		left = right = null;
	}

	/**
	 * Erzeuge einen neuen Bin�rbaum(-Knoten), entspricht tree().
	 * @param value Der Wert des Knotens.
	 * @param left Der linke Teilbaum.
	 * @param right Der rechte Teilbaum.
	 */
	public TreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public E getValue() {
		return value;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	/**
	 * Bestimmt die Anzahl der Elemente in diesem Baum.
	 *
	 * @return
	 */
	public int size() {
		return size(this);
	}

	/**
	 * Bestimmt die Anzahl der Elemente in diesem Baum.
	 *
	 * @param node Wurzelknoten eines (Teil-)Baums.
	 * @return
	 */
	private int size(TreeNode<E> node) {
		if (node == null) { // Leerer Baum?
			return 0; // Anzahl Elemente ist 0.
		} else { // Echter Teilbaum.
			// Größe ist dieser Knoten plus solche in den Teilbäumen:
			int sizeLeft = size(node.getLeft());
			int sizeRight = size(node.getRight());
			return 1 + sizeLeft + sizeRight;
		}
	}

	public String toString() {
		return value + " ";
	}

	/**
	 * Gibt den Baum ab dem Wurzelknoten in Inorder-Reihenfolge
	 * auf die Konsole aus.
	 */
	public void printInorder() {
		printInorder(this);
		System.out.println(); // Am Ende noch eine neue Zeile.
	}

	/**
	 * Durchl�uft einen (Teil-)Baum vom Wurzelknoten an in
	 * Inorder-Reihenfolge und gibt die Werte auf die Konsole aus.
	 *
	 * @param node Wurzelknoten des (Teil-)Baums
	 */
	private void printInorder(TreeNode<E> node) {
		if (node != null) { // Ist der Baum nicht leer?
			// Dann kann weiter gemacht werden.
			printInorder(node.getLeft());
			System.out.println(node.toString());
			printInorder(node.getRight());
		}
	}
	/**
	 * Ermittelt ob zwei B�ume identisch zueinander sind 
	 * @param otherNode Baum der verlichen werden soll
	 * @return wahr wenn die B�ume indentisch sind 
	 */
	public boolean equalStructure(TreeNode<E> otherNode) {

		TreeNode<E> current = this;
		TreeNode<E> current2 = this; 
		if(otherNode == null) {
			System.out.println(2);
			return false;
		}else if(current.getValue() == null && otherNode.getValue() == null) {
			return true;
		}
		while((otherNode != null && current != null) && otherNode.getValue() == current.getValue()) {
			current = current.getLeft(); 
			otherNode = otherNode.getLeft(); 
			if(otherNode == null) {
				System.out.println(3);
				return true;
			}

			while((otherNode != null && current2 != null) && otherNode.getValue() == current2.getValue()) {
				current2 = current2.getRight(); 
				otherNode = otherNode.getRight(); 

				if(otherNode == null) 
					return true;
			}
		}
		return false;
	}

	//	
	/**
	 * Bestimme die H�he des Baums.
	 *
	 * @return H�he des Baums
	 */
	public int height() {
		if (value == null)
			return 0;
		else {
			int left = 0, right = 0;
			if (this.left != null) {
				left = this.left.height();
			}
			if (this.right != null) {
				right = this.right.height();
			}

			return Math.max(left, right) + 1;
		}
	}

	public static void main(String[] args) {



		TreeNode<Integer> t2 = new TreeNode<Integer>(1, new TreeNode<Integer>(2), new TreeNode<Integer>(3));
		TreeNode<Integer> t4 = new TreeNode<Integer>(1, new TreeNode<Integer>(2), new TreeNode<Integer>(3));
		TreeNode<Integer> t3 = new TreeNode<Integer>(4, new TreeNode<Integer>(2), new TreeNode<Integer>(3, new TreeNode<Integer>(5), new TreeNode<Integer>(8)));
		TreeNode<Integer> t1 = new TreeNode<Integer>(1); 
		//		t1.left = new TreeNode<Integer>(2); 
		//		t1.right = new TreeNode<Integer>(3); 
		//		TreeNode<Integer> t4 = new TreeNode<Integer>(5); 
		//		t4.left = new TreeNode<Integer>(6); 
		//		t4.right = new TreeNode<Integer>(8); 
		//		TreeNode<Integer> t2 = new TreeNode<Integer>(1); 
		//		t2.left = new TreeNode<Integer>(2); 
		//		t2.right = new TreeNode<Integer>(3); 
		//		TreeNode<Integer> t2 = new TreeNode<Integer>(1, new TreeNode<Integer>(2), new TreeNode<Integer>(3));

//		t1.printInorder();
//		t2.printInorder();
		System.out.println(t2.equalStructure(t4)); 
		System.out.println(t1.equalStructure(t3)); 
	}

}
