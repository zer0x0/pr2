package de.hsmannheim.inf.pr2.ads;

public class AVLTreeNode<E extends Comparable<E>> extends TreeNode<E> {

	public AVLTreeNode(E v) {
		super(v);

	}

	public AVLTreeNode(E v, TreeNode<E> lefNode, TreeNode<E> rigNode) {
		super(v, lefNode, rigNode);
	}

	boolean isSearchTree() {
		return isSearchTree(this);

	}

//	private boolean isSearchTree(TreeNode<E> avlTreeNode) {
//		/*
//		 * wenn suchbaum leer dann return true; wenn linke seite > rechte seite dann
//		 * false
//		 */
//		if (avlTreeNode.left == null && avlTreeNode.right == null) {
//			return true;
//		}
//		if (avlTreeNode.left != null) {
//			if (avlTreeNode.left.value.compareTo(this.value) > -1) {
//				return false;
//			}
//		}
//		if (avlTreeNode.right != null) {
//			if (avlTreeNode.right.value.compareTo(this.value) < +1) {
//				return false;
//			}
//		}
//
//		return isSearchTree(avlTreeNode.left) && isSearchTree(this.right);
//	}
	
	private boolean isSearchTree(TreeNode<E> avlTreeNode) {
		/*
		 * wenn suchbaum leer dann return true; wenn linke seite > rechte seite dann
		 * false
		 */
		if (avlTreeNode == null ) {
			return true;
		}
		if (avlTreeNode.left != null) {
			if (avlTreeNode.left.value.compareTo(this.value) > -1) {
				return false;
			}else {
				isSearchTree(avlTreeNode.left);
			}
		}
		if (avlTreeNode.right != null) {
			if (avlTreeNode.right.value.compareTo(this.value) < +1) {
				return false;
			}else {
				isSearchTree(this.right);
			}
		}

		return true;
	}


	private boolean isAVLTree(TreeNode<E> e) {
		if (e == null)
			return true;
		int bf = balanceFactor(e);
		if (bf > 1 || bf < -1)
			return false;
		return isAVLTree(e.left) && isAVLTree(e.right);
	}

//	private int heightLeft(TreeNode<E> left) {
//		if (left == null)
//			return -1;
//		return left.height();
//	}
//
//	private int heightRight(TreeNode<E> right) {
//		if (right == null)
//			return -1;
//		return right.height();
//	}
//	

	private int balanceFactor(TreeNode<E> e) {
		if (e.left == null) {
			return -1;
		} else if (e.right == null) {
			return -1;

		} else {
			return e.left.height() - e.right.height();
		}

	}

}
