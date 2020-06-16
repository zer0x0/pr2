package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HeapTreeNode<E extends Comparable<E>> extends TreeNode<E> implements Iterable<E> {

	protected HeapTreeNode<E> lNode;
	protected HeapTreeNode<E> rNode;

	public HeapTreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
		super(value, left, right);
	}

	public HeapTreeNode(E value) {
		super(value);
	}

	int size(HeapTreeNode<E> e) {
		if (e == null) {
			return -1;
		}
		return e.size();
	}

	/**
	 * Methode prüft ob MinHeap Kriterium erfüllt ist
	 * 
	 * @return true falls ja ansonsten false
	 */
	public boolean isMinHeapTree() {
		TreeNode<E> current = this;

		if (getLeft() == null || getRight() == null) {
			return true;
		} else if (current.getValue().compareTo(current.getLeft().getValue()) > 0
				|| current.getValue().compareTo(current.getRight().getValue()) > 0) {
			return false;
		} else {
			if (getLeft() == null || getRight() == null) {
				return true;
			}
			current = current.getLeft();
			current = current.getRight();
		}
		// }
		return true;
	}

	/**
	 * Methode prüft ob MaxHeap Kriterium erfüllt ist
	 * 
	 * @return true falls ja ansonsten false
	 */
	public boolean isMaxHeapTree() {
		TreeNode<E> current = this;

		if (getLeft() == null || getRight() == null) {
			return true;
		} else if (current.getValue().compareTo(current.getLeft().getValue()) < 0
				|| current.getValue().compareTo(current.getRight().getValue()) < 0) {
			return false;
		} else {
			if (getLeft() == null || getRight() == null) {
				return true;
			}
			current = current.getLeft();
			current = current.getRight();
		}

		return true;
	}

	/**
	 * Methode zählt die Knoten eines Baums (links und rechts)
	 * 
	 * @param root Werte des Baums
	 * @return countNodes Anzahl der Knoten(links und rechts)
	 */
	int countNodes(TreeNode<E> root) {
		if (root == null)
			return 0;
		return (1 + countNodes(root.left) + countNodes(root.right));
	}

	/**
	 * Methode pr�ft ob Baum geordnet ist
	 * 
	 * @param root         Wert des Wurzelknotens
	 * @param index        der aktuellen Position im Baum
	 * @param number-nodes Summe aller Knoten des Baums
	 */
	boolean isCompleteUtil(TreeNode<E> root, int index, int number_nodes) {
		if (root == null)
			return true;

		if (index >= number_nodes)
			return false;

		return isCompleteUtil(root.left, 2 * index + 1, number_nodes)
				&& isCompleteUtil(root.right, 2 * index + 2, number_nodes);

	}

	boolean isHeapUtil(TreeNode<E> root) {
		if (root.left == null && root.right == null)
			return true;

		if (root.right == null) {

			return root.value.compareTo(root.left.value) >= 0;
		} else {

			if (root.value.compareTo(root.left.value) >= 0 && root.value.compareTo(root.right.value) >= 0)
				return isHeapUtil(root.left) && isHeapUtil(root.right);
			else
				return false;
		}
	}

	/**
	 * Methode pr�ft ob Baum Heap-Kriterium erfüllt
	 * 
	 * @return true falls ja, ansonsten false
	 */
	public boolean isHeap() {
		if (this == null)
			return true;

		int node_count = countNodes(this);

		if (isCompleteUtil(this, 0, node_count) == true && isHeapUtil(this) == true)
			return true;
		return false;
	}

	/**
	 * Methode die einen Baum in eine Array Liste überträgt
	 * 
	 * @return gibt die Liste in LevelOrder zurück
	 */
	public ArrayList<E> heapToList() {

		// ArrayList f�r die Ausabe am Schluss
		ArrayList<E> output = new ArrayList<>();
		if (this.getValue() == null) {
			return output;
		}

		// LinkedList als Hilfsliste zum Zwischenspeichern f�r LevelOrder
		LinkedList<HeapTreeNode<E>> helperList = new LinkedList<>();
		helperList.add(this);

		// Solange die Liste nicht leer ist
		// lege neue Liste an und bef�lle diese mit den einzelnen Werten des Baums
		while (!helperList.isEmpty()) {
			ArrayList<E> singleNodes = new ArrayList<E>();
			for (int i = 0; i < helperList.size(); i++) {
				HeapTreeNode<E> cNode = helperList.remove();
				singleNodes.add(cNode.getValue());

				// f�lle Hilfsliste mit linken Werten
				if (cNode.getLeft() != null) {
					helperList.add((HeapTreeNode<E>) cNode.getLeft());
				}
				// f�lle Hilfsliste mit rechten Werten
				if (cNode.getRight() != null) {
					helperList.add((HeapTreeNode<E>) cNode.getRight());
				}
			}
			// f�lle alle Werte aus der Liste singleNodes in die Ausgabeliste
			output.addAll(singleNodes);
		}
		return output;
	}

	public static void main(String[] args) {

		HeapTreeNode<Integer> isMinHeapTreeNode = new HeapTreeNode<Integer>(10);
		isMinHeapTreeNode.left = new HeapTreeNode<Integer>(15);
		isMinHeapTreeNode.left.left = new HeapTreeNode<Integer>(40);
		isMinHeapTreeNode.left.right = new HeapTreeNode<Integer>(50);
		isMinHeapTreeNode.right = new HeapTreeNode<Integer>(30);
		isMinHeapTreeNode.right.left = new HeapTreeNode<Integer>(100);
		isMinHeapTreeNode.right.right = new HeapTreeNode<Integer>(40);

		HeapTreeNode<Integer> isMaxHeapTreeNode = new HeapTreeNode<Integer>(100);
		isMaxHeapTreeNode.left = new HeapTreeNode<Integer>(40);
		isMaxHeapTreeNode.left.left = new HeapTreeNode<Integer>(10);
		isMaxHeapTreeNode.left.right = new HeapTreeNode<Integer>(15);
		isMaxHeapTreeNode.right = new HeapTreeNode<Integer>(50);
		isMaxHeapTreeNode.right.left = new HeapTreeNode<Integer>(25);
		isMaxHeapTreeNode.right.right = new HeapTreeNode<Integer>(1);

		HeapTreeNode<Integer> root = new HeapTreeNode<Integer>(1);
		root.left = new HeapTreeNode<Integer>(3);
		root.right = new HeapTreeNode<Integer>(2);
		root.left.left = new HeapTreeNode<Integer>(4);
		root.left.right = new HeapTreeNode<Integer>(4);
		root.right.left = new HeapTreeNode<Integer>(8);
		root.right.right = new HeapTreeNode<Integer>(7);

		HeapTreeNode<Integer> bt = new HeapTreeNode<Integer>(10);
		bt.left = new HeapTreeNode<Integer>(9);
		bt.right = new HeapTreeNode<Integer>(8);
		bt.left.left = new HeapTreeNode<Integer>(7);
		bt.left.right = new HeapTreeNode<Integer>(6);
		bt.right.left = new HeapTreeNode<Integer>(5);
		bt.right.right = new HeapTreeNode<Integer>(4);
		bt.left.left.left = new HeapTreeNode<Integer>(3);
		bt.left.left.right = new HeapTreeNode<Integer>(2);
		bt.left.right.left = new HeapTreeNode<Integer>(1);

		System.out.println(root.heapToList());
		System.out.println(isMaxHeapTreeNode.isMinHeapTree());
		System.out.println(isMaxHeapTreeNode.isMaxHeapTree());
		System.out.println(isMinHeapTreeNode.isMaxHeapTree());
		System.out.println(isMinHeapTreeNode.isMinHeapTree());
		System.out.println(bt.isMaxHeapTree());
		System.out.println(root.isMinHeapTree());

		// um den Iterator zu testen
		for (Iterator<Integer> it = bt.iterator(); it.hasNext();) {
			Integer i = it.next();
			System.out.print(i + " ");
			if (i.equals(8))
				System.out.println("Der Baum enth�lt folgende Zahl:" + i);

		}
	}

	/**
	 * �berschrieben Methode iterator()
	 * 
	 * @return gibt ein iterator-Objekt für unsere Liste zurück
	 */
	@Override
	public Iterator<E> iterator() {
		return this.heapToList().iterator();
	}
}
