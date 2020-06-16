package de.hsmannheim.inf.pr2.ads;

import de.hsmannheim.inf.pr2.ads.AVLTreeNode;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class AVLTest {



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

		AVLTreeNode<Integer> t9 = new AVLTreeNode<Integer>(2, new TreeNode<Integer>(1), new TreeNode<Integer>(3));

		assertTrue(t9.isAVLTree());	
		assertFalse(istKeinAVLBaum.isAVLTree());
		//			assertEquals(false, istEinAVLBaum.isAVLTree());	
		//			assertFalse(istKeinAVLBaum.isAVLTree());	
		//			assertEquals(false, istKeinAVLBaum.isAVLTree());	
	}


//	@Test
//	public void testIsSearchTree() {
//		AVLTreeNode<Integer> istSearchTree = 
//				new AVLTreeNode<Integer>(27,
//						new TreeNode<Integer>(14, 
//								new TreeNode<Integer>(10),
//								new TreeNode<Integer>(19)),
//
//						new TreeNode<Integer>(35, 
//								new TreeNode<Integer>(31), 
//
//								new TreeNode<Integer>(42) 
//								));
//
//		AVLTreeNode<Integer> isSearchTree = 
//				new AVLTreeNode<Integer>(2,
//						new TreeNode<Integer>(1), 
//						new TreeNode<Integer>(6,
//								new TreeNode<Integer>(4,
//
//										new TreeNode<Integer>(3), 
//										new TreeNode<Integer>(5)), 
//
//								new TreeNode<Integer>(7, 
//										new TreeNode<Integer>(null), 
//										new TreeNode<Integer>(8))));
		//
		//			AVLTreeNode<Integer> keinSearchTree = 
		//					new AVLTreeNode<Integer>(27,
		//							new TreeNode<Integer>(28, 
		//									new TreeNode<Integer>(10),
		//									new TreeNode<Integer>(19)),
		//
		//							new TreeNode<Integer>(24, 
		//									new TreeNode<Integer>(31), 
		//
		//									new TreeNode<Integer>(42) 
		//									));
		////
//		AVLTreeNode<Integer> noSearchTree = new AVLTreeNode<Integer>(2, 
//				new AVLTreeNode<Integer>(1), 
//				new AVLTreeNode<Integer>(3, 
//						new AVLTreeNode<Integer>(4), 
//						new AVLTreeNode<Integer>(6, 
//								new AVLTreeNode<Integer>(5), 
//								new AVLTreeNode<Integer>(7)))); 

//		assertFalse(noSearchTree.isSearchTree()); 
//		assertTrue(istSearchTree.isSearchTree()); 
		//
//		assertTrue(isSearchTree.isSearchTree());

	}

