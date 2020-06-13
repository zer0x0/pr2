package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AVLTreeNodeTest {

	@Test
	public void testIsAVLTree() {
		AVLTreeNode<Integer> istEinAVLBaum = new AVLTreeNode<Integer>(5,
				new TreeNode<Integer>(2, new TreeNode<Integer>(1),
						new TreeNode<Integer>(4, new TreeNode<Integer>(3), new TreeNode<Integer>(null))),
				new TreeNode<Integer>(8, new TreeNode<Integer>(7), new TreeNode<Integer>(null)));

		AVLTreeNode<Integer> istKeinAVLBaum = new AVLTreeNode<Integer>(5,
				new TreeNode<Integer>(2, new TreeNode<Integer>(1),
						new TreeNode<Integer>(4, new TreeNode<Integer>(3), new TreeNode<Integer>(5))),
				new TreeNode<Integer>(8, new TreeNode<Integer>(null), new TreeNode<Integer>(null)));

		assertEquals(true, istEinAVLBaum.isAVLTree());
//	    assertEquals(false, istEinAVLBaum.isAVLTree());
//	    assertEquals(true, istKeinAVLBaum.isAVLTree());
//	    assertEquals(false, istKeinAVLBaum.isAVLTree());
	}
}
