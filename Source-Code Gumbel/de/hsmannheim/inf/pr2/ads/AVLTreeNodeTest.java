package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AVLTreeNodeTest {

	@Test
	public void testIsAVLTree() {
		AVLTreeNode<Integer> istEinAVLBaum = 
				new AVLTreeNode<Integer>(5,
				new TreeNode<Integer>(2, 
						new TreeNode<Integer>(1),
						new TreeNode<Integer>(4, 
								new TreeNode<Integer>(3), 
								new TreeNode<Integer>(null))),
				new TreeNode<Integer>(8, 
						new TreeNode<Integer>(7), 
								
						new TreeNode<Integer>(null) 
								));
		
		AVLTreeNode<Integer> istKeinAVLBaum = 
				new AVLTreeNode<Integer>(5,
				new TreeNode<Integer>(2, 
						new TreeNode<Integer>(1),
						new TreeNode<Integer>(4, 
								new TreeNode<Integer>(3), 
								new TreeNode<Integer>(5))),
				new TreeNode<Integer>(8, 
						new TreeNode<Integer>(null), 
								
						new TreeNode<Integer>(null) 
								));
		
		assertEquals(true, istEinAVLBaum.isAVLTree(istEinAVLBaum));	
		assertEquals(false, istEinAVLBaum.isAVLTree(istEinAVLBaum));	
		assertEquals(true, istKeinAVLBaum.isAVLTree(istKeinAVLBaum));	
		assertEquals(false, istKeinAVLBaum.isAVLTree(istKeinAVLBaum));	
	}
	
	public void testIsSearchTree() {
		AVLTreeNode<Integer> istSearchTree = 
				new AVLTreeNode<Integer>(27,
				new TreeNode<Integer>(14, 
						new TreeNode<Integer>(10),
						new TreeNode<Integer>(19)),
								
				new TreeNode<Integer>(35, 
						new TreeNode<Integer>(31), 
								
						new TreeNode<Integer>(42) 
								));
		
		AVLTreeNode<Integer> keinSearchTree = 
				new AVLTreeNode<Integer>(27,
				new TreeNode<Integer>(28, 
						new TreeNode<Integer>(10),
						new TreeNode<Integer>(19)),
								
				new TreeNode<Integer>(24, 
						new TreeNode<Integer>(31), 
								
						new TreeNode<Integer>(42) 
								));
		
		assertEquals(true, istSearchTree.isSearchTree(istSearchTree));	
		assertEquals(false, istSearchTree.isSearchTree(istSearchTree));	
		assertEquals(true, keinSearchTree.isSearchTree(keinSearchTree));	
		assertEquals(false, istSearchTree.isSearchTree(istSearchTree));	
	}

}