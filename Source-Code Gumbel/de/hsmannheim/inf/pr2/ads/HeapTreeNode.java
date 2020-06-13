package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;

public class HeapTreeNode<E extends Comparable<E>> extends TreeNode<E> implements Iterable<E> {
	
	/*
	 * E oder T - bedeutet, dass die Klasse generisch ist und Comparable - macht die
	 * Klasse "bounded" ist.
	 */

	public HeapTreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
		super(value, left, right);
	}

	boolean isMinHeapTree(HeapTreeNode<E> n) {
		int i = 0;
		return isHeap(n, i, size(n));
	}

	private boolean isHeap(TreeNode<E> root, int i, int n) {
		if (root == null) {
			return true;
		}
		if (i >= n) {
			return false;
		}
		if ((root.left != null && root.left.value.compareTo(root.value) < 0)
				|| (root.right != null && root.right.value.compareTo(root.value) < 0)) {
			return false;
		}
		return isHeap(root.left, 2 * i + 1, n) && isHeap(root.right, 2 * i + 2, n);
	}

	boolean isMaxHeapTree(HeapTreeNode<E> n) {
		int i = 0;
		return isMaxHeap(n, i, size(n));
	}

	int size(HeapTreeNode<E> e) {
		if (e == null) {
			return -1;
		}
		return e.size();
	}

	private boolean isMaxHeap(TreeNode<E> root, int i, int n) {
		if (root == null) {
			return true;
		}
		if (i >= n) {
			return false;
		}
		if ((root.left != null && root.left.value.compareTo(root.value) > 0)
				|| (root.right != null && root.right.value.compareTo(root.value) > 0)) {
			return false;
		}
		return isMaxHeap(root.left, 2 * i + 1, n) && isMaxHeap(root.right, 2 * i + 2, n);
	}

	ArrayList<E> heapToList(HeapTreeNode<E> value) {
		ArrayList<E> list = new ArrayList<E>();
		return heapToList1(value, list);
	}

	private ArrayList<E> heapToList1(TreeNode<E> node, ArrayList<E> list) {
		if (node == null) {
			return list;
		}

		heapToList1(node.left, list);
		list.add(node.value);
		heapToList1(node.right, list);

		return list;
	}

	/*
	 * Aufgabe 6
	 */

	@Override
	public Iterator<E> iterator() {
		return new ArrayIterator<E>(heapToList(this));
	}
}

class ArrayIterator<E> implements Iterator<E> {

	ArrayList<E> arrayList;
	int index;

	public ArrayIterator(ArrayList<E> array) {
		arrayList = array;
		index = 0;

	}

	@Override
	public boolean hasNext() {
		return arrayList.get(index++) != null;

	}

	@Override
	public E next() {
		if (hasNext() == true) {

			index++;
			return arrayList.get(index);
		}
		return null;
	}

}
