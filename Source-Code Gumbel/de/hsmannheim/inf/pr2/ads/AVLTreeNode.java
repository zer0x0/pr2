package de.hsmannheim.inf.pr2.ads;
/**
 * PÜ4 - Aufgabe 2 & Aufgabe 3
 * 
 * @author zer0x0
 *
 * @param <E>
 */

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

	boolean isAVLTree() {
		if (this.isSearchTree()) {
			return isAVLTree(this);
		}
		return false;
	}

	protected boolean isAVLTree(TreeNode<E> e) {
		if (e == null)
			return true;

		int bf = balanceFactor(e);
		if (bf > 1 || bf < -1)
			return false;

		return isAVLTree(e.left) && isAVLTree(e.right);
	}

	private int balanceFactor(TreeNode<E> e) {
		if (e.left == null) {
			return -1;
		} else if (e.right == null) {
			return -1;

		} else {
			return e.left.height() - e.right.height();
		}

	}

	boolean isSearchTree() {
		return isSearchTree(this);

	}
	
	TreeNode<E> findmax( TreeNode<E> root) {
		if (root == null) {
			return null;
		}
		while (root.right != null) {
			root = root.right;
		}
		return root;
	}
	
	TreeNode<E> findMin( TreeNode<E> root) {
		if (root == null) {
			return null;
		}
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	

	protected boolean isSearchTree(TreeNode<E> avlTreeNode) {
		if (avlTreeNode == null) {
			return true;
		}
		
		return true;
	}

//	public boolean isSearchTree(TreeNode<E> node, Integer lower, Integer upper) {
//	    if (node == null) return true;
//	    int val = (int) node.value;
//	    if (lower != null && val <= lower) return false;
//	    if (upper != null && val >= upper) return false;
//
//	    if (! isSearchTree(node.right, val, upper)) return false;
//	    if (! isSearchTree(node.left, lower, val)) return false;
//	    return true;
//	  }
//
//	  public boolean isSearchTree(AVLTreeNode <E>root) {
//	    return isSearchTree(root, null, null);
//	  }

	
	
	
	public static void main(String[] args) {
		// ja
		AVLTreeNode<Integer> t2 = new AVLTreeNode<Integer>(8, new TreeNode<Integer>(3), new TreeNode<Integer>(10));
		// ja
		AVLTreeNode<Integer> t5 = new AVLTreeNode<Integer>(2, new TreeNode<Integer>(1), new TreeNode<Integer>(3));
		// nein
		AVLTreeNode<Integer> t3 = new AVLTreeNode<Integer>(8, new TreeNode<Integer>(7), new TreeNode<Integer>(5));
		// nein
		AVLTreeNode<Integer> t4 = new AVLTreeNode<Integer>(3, new TreeNode<Integer>(4), new TreeNode<Integer>(5));

//		System.out.println(t2.isSearchTree(t2));
//		
//		System.out.println(t5.isSearchTree(t5));
//		
//		System.out.println(t3.isSearchTree(t3));
//		
//		System.out.println(t4.isSearchTree(t4));

//		System.out.println(t4.isAVLTree(t4));

		AVLTreeNode<Integer> avlBaum = new AVLTreeNode<Integer>(6);
		avlBaum.left = new AVLTreeNode<Integer>(3);
		avlBaum.left.left = new AVLTreeNode<Integer>(1);
		avlBaum.left.right = new AVLTreeNode<Integer>(5);
		avlBaum.right = new AVLTreeNode<Integer>(9);
		avlBaum.right.left = new AVLTreeNode<Integer>(7);
		avlBaum.right.right = new AVLTreeNode<Integer>(11);
		
		AVLTreeNode<Integer> avlBaumbutNotBST = new AVLTreeNode<Integer>(6);
		
		avlBaumbutNotBST.left = new AVLTreeNode<Integer>(3);
		avlBaumbutNotBST.left.left = new AVLTreeNode<Integer>(4);
		avlBaumbutNotBST.left.right = new AVLTreeNode<Integer>(5);
		
		avlBaumbutNotBST.right = new AVLTreeNode<Integer>(9);
		avlBaumbutNotBST.right.left = new AVLTreeNode<Integer>(7);
		avlBaumbutNotBST.right.right = new AVLTreeNode<Integer>(11);
	

		AVLTreeNode<Integer> notAvlBaum = new AVLTreeNode<Integer>(7);
		notAvlBaum.left = new AVLTreeNode<Integer>(2);
		notAvlBaum.left.left = new AVLTreeNode<Integer>(1);
		notAvlBaum.left.right = new AVLTreeNode<Integer>(4);
		notAvlBaum.left.right.left = new AVLTreeNode<Integer>(3);
		notAvlBaum.left.right.right = new AVLTreeNode<Integer>(5);
		notAvlBaum.right = new AVLTreeNode<Integer>(8);

		AVLTreeNode<Integer> notAvlBaum2 = new AVLTreeNode<Integer>(7);
		notAvlBaum2.left = new AVLTreeNode<Integer>(2);
		notAvlBaum2.left.left = new AVLTreeNode<Integer>(1);
		notAvlBaum2.left.right = new AVLTreeNode<Integer>(4);
		notAvlBaum2.left.right.right = new AVLTreeNode<Integer>(null);
		notAvlBaum2.left.right.left = new AVLTreeNode<Integer>(3);
		notAvlBaum2.left.right.left.left = new AVLTreeNode<Integer>(2);
		notAvlBaum2.left.right.right = new AVLTreeNode<Integer>(5);
		notAvlBaum2.right = new AVLTreeNode<Integer>(8);
		notAvlBaum2.right.left = new AVLTreeNode<Integer>(7);
		notAvlBaum2.right.right = new AVLTreeNode<Integer>(null);

		System.out.println(avlBaum.isAVLTree());

		System.out.println(notAvlBaum.isAVLTree());

		System.out.println(notAvlBaum2.isAVLTree());
		
		System.out.println(avlBaumbutNotBST.isSearchTree());

	}
}
