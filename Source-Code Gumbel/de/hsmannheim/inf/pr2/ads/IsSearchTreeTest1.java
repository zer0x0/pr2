package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsSearchTreeTest1 {

	@Test
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

        AVLTreeNode<Integer> isSearchTree = 
                new AVLTreeNode<Integer>(2,
                        new TreeNode<Integer>(1), 
                        new TreeNode<Integer>(6,
                                new TreeNode<Integer>(4,

                                        new TreeNode<Integer>(3), 
                                        new TreeNode<Integer>(5)), 

                                new TreeNode<Integer>(7, 
                                        new TreeNode<Integer>(0), 
                                        new TreeNode<Integer>(8))));
AVLTreeNode<Integer> keinSearchTree = 
                new AVLTreeNode<Integer>(27,
                        new TreeNode<Integer>(28, 
                                new TreeNode<Integer>(10),
                                new TreeNode<Integer>(19)),

                        new TreeNode<Integer>(24, 
                                new TreeNode<Integer>(31), 

                                new TreeNode<Integer>(42) 
                                ));

        AVLTreeNode<Integer> noSearchTree = 
                new AVLTreeNode<Integer>(1,
                        new TreeNode<Integer>(2), 
                        new TreeNode<Integer>(3,
                                new TreeNode<Integer>(4,

                                        new TreeNode<Integer>(6), 
                                        new TreeNode<Integer>(7)), 

                                new TreeNode<Integer>(5,
                                        new TreeNode<Integer>(null), 
                                        new TreeNode<Integer>(8))));


        assertEquals(true, isSearchTree.isSearchTree());
        assertEquals(false, noSearchTree.isSearchTree());
        assertEquals(false, keinSearchTree.isSearchTree());
    }
	}


