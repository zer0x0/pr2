package de.hsmannheim.inf.pr2.ads;

public class AVLTreeNode<E extends Comparable<E>> extends TreeNode<E> {

	public AVLTreeNode(E v) {
		super(v);
	}

	public AVLTreeNode(E v, TreeNode<E> lefNode, TreeNode<E> rigNode) {
		super(v, lefNode, rigNode);
	}

	int size(AVLTreeNode<E> e) {
		if (e == null) {
			return -1;
		}
		return e.size();
	}

	public String toString() {
		return value + " ";
	}

	private void printInPreOrder(TreeNode<E> node) {
		if (node != null) {
			System.out.println(node.toString());
			printInPreOrder(node.getLeft());
			printInPreOrder(node.getRight());
		}
	}

	// private int height(AVLTreeNode<E> e) {
	// if (e == null) return -1;
	// return e.height();
	// }

	private E min;
	private E max;

	/**
	 * Methode zum Aufruf von isMin(TreeNode<E> e)
	 */
	public E isMin() {
		return isMin(this);
	}

	/**
	 * Methode ermittelt den kleinsten Wert im linken Teil
	 * 
	 * @param e Knoten-Werte
	 * @return min kleinstes Element
	 */
	private E isMin(TreeNode<E> e) {
		if (e == null)
			return min;
		this.min = e.getValue();
		E leftMin = isMin(e.left);
		E rightMin = isMin(e.right);

		if (leftMin.compareTo(rightMin) < 0)
			min = leftMin;
//		System.out.println(min);
		if (rightMin.compareTo(leftMin) < 0)
			min = rightMin;
//		System.out.println(min);

		return min;

	}

	/**
	 * Methode zum Aufruf von isMax(TreeNode <E> e)
	 */
	public E isMax() {
		return isMax(this);
	}

	/**
	 * Methode ermittelt den größten Wert im rechten Teil
	 * 
	 * @param e Knoten-Werte
	 * @return max größtes Element
	 */
	private E isMax(TreeNode<E> e) {
		if (e == null)
			return max;
		this.max = e.getValue();
		E leftMax = isMax(e.left);
		E rightMax = isMax(e.right);

		if (leftMax.compareTo(rightMax) > 0)
			min = leftMax;
		if (rightMax.compareTo(leftMax) > 0)
			min = rightMax;

		return max;
	}

	/**
	 * Methode zum Aufruf von isSearchTree(TreeNode<E> node)
	 */
	public boolean isSearchTree() {
		return isSearchTree(this);
	}

	/**
	 * Methode prüft Baum auf Suchbaum-Kriterien und verleicht immer den Knoten mit
	 * dem größten und kleinsten Wert jeweils mit der Wurzel
	 * 
	 * @param node Knoten-Werte
	 * @return true wenn Kriterium erfüllt, ansonsten falls
	 */
	private boolean isSearchTree(TreeNode<E> node) {
		if (isMax(node.getLeft()).compareTo(node.getValue()) > 0) {
			return false;
		}
		if (isMin(node.getRight()).compareTo(node.getValue()) < 0) {
			return false;
		}
		return true;

	}

	/**
	 * Methode zum Aufruf für isAVLTree
	 */
	public boolean isAVLTree() {
		return isAVLTree(this);
	}

	/**
	 * Methode überprüft ob der �bergebener Baum die AVL-Kriterien erfüllt über die
	 * Methode balance() aus der Klasse TreeNode
	 * 
	 * @param e Knoten-Werte
	 * @return true wenn Kriterium erfüllt ist, ansonsten false
	 */
	private boolean isAVLTree(TreeNode<E> e) {

		if (e == null) {
			return true;
		}
		int bf = e.balance();

		if (bf > 1 || bf < -1)
			return false;

		return isAVLTree(e.left) && isAVLTree(e.right);

	}

	public static void main(String[] args) {

		AVLTreeNode<Integer> noSearchTree = new AVLTreeNode<Integer>(2);
		noSearchTree.left = new AVLTreeNode<Integer>(1);
		noSearchTree.right = new AVLTreeNode<Integer>(3);
		noSearchTree.left.left = new AVLTreeNode<Integer>(4);
		noSearchTree.left.right = new AVLTreeNode<Integer>(6);
		noSearchTree.right.left = new AVLTreeNode<Integer>(7);

		AVLTreeNode<Integer> isSearchTree = new AVLTreeNode<Integer>(2);
		isSearchTree.left = new AVLTreeNode<Integer>(1);
		isSearchTree.right = new AVLTreeNode<Integer>(6);
		isSearchTree.left.left = new AVLTreeNode<Integer>(4);
		isSearchTree.left.right = new AVLTreeNode<Integer>(3);
		isSearchTree.right.left = new AVLTreeNode<Integer>(5);
		isSearchTree.right.right = new AVLTreeNode<Integer>(7);
		isSearchTree.left.left.left = new AVLTreeNode<Integer>(6);
		isSearchTree.left.left.right = new AVLTreeNode<Integer>(8);

		AVLTreeNode<Integer> istEinAVLBaum = new AVLTreeNode<Integer>(5,
				new TreeNode<Integer>(2, new TreeNode<Integer>(1),
						new TreeNode<Integer>(4, new TreeNode<Integer>(3), new TreeNode<Integer>(null))),
				new TreeNode<Integer>(8, new TreeNode<Integer>(7),

						new TreeNode<Integer>(null)));

		AVLTreeNode<Integer> istKeinAVLBaum = new AVLTreeNode<Integer>(5,
				new TreeNode<Integer>(2, new TreeNode<Integer>(1),
						new TreeNode<Integer>(4, new TreeNode<Integer>(3), new TreeNode<Integer>(5))),
				new TreeNode<Integer>(8, new TreeNode<Integer>(null),

						new TreeNode<Integer>(null)));

		AVLTreeNode<Integer> t9 = new AVLTreeNode<Integer>(2, new TreeNode<Integer>(1), new TreeNode<Integer>(3));
		AVLTreeNode<Integer> t11 = new AVLTreeNode<Integer>(1, new TreeNode<Integer>(2), new TreeNode<Integer>(3));

		System.out.println(t9.isSearchTree());
		System.out.println(noSearchTree.isSearchTree());
		System.out.println(t9.isAVLTree());
		System.out.println(t11.isAVLTree());
		System.out.println(istEinAVLBaum.isAVLTree());
		System.out.println(istKeinAVLBaum.isAVLTree());

	}
}
