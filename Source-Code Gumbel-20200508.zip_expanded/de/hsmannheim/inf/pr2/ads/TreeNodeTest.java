package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeNodeTest {


	@Test
	void isEmptytest() {
		SearchTree<Integer> t1 = new SearchTree<>();
		SearchTree<String> ts = new SearchTree<>(); 
		assertTrue(t1.isEmpty()); 
		assertTrue(ts.isEmpty()); 

	}
	@Test
	void isEmptytest2() {
		SearchTree<Integer> t2 = new SearchTree<>(); 
		SearchTree<String> ts2 = new SearchTree<>();
		t2.add(1); 
		t2.add(3); 
		ts2.add("Hallo"); 
		ts2.add("Welt"); 
		assertFalse(t2.isEmpty()); 
		assertFalse(ts2.isEmpty()); 
	}
	@Test
	void isEmptytest3() {
		SearchTree<Integer> t3 = new SearchTree<>();
		SearchTree<String> ts3 = new SearchTree<>();
		t3.add(4); 
		t3.add(8); 
		t3.clear();
		ts3.add("ist"); 
		ts3.add("Hallo"); 
		ts3.clear();
		assertTrue(t3.isEmpty()); 
		assertTrue(ts3.isEmpty()); 
	}

	@Test 
	void clear() {
		SearchTree<Integer> t3 = new SearchTree<>();
		SearchTree<String> ts3 = new SearchTree<>();
		t3.add(83); 
		t3.add(25); 
		t3.clear();
		ts3.add("Welt"); 
		ts3.add("sch�n"); 
		ts3.clear();
		assertTrue(t3.isEmpty()); 
		assertTrue(ts3.isEmpty()); 
	}
	@Test 
	void containsRek() {
		SearchTree<Integer> t4 = new SearchTree<>();
		SearchTree<String> ts4 = new SearchTree<>();
		t4.add(83); 
		t4.add(25); 
		ts4.add("Welt"); 
		ts4.add("sch�n"); 
		assertTrue(t4.contains(25)); 
		assertTrue(t4.contains(83)); 
		assertFalse(t4.contains(5)); 
		assertFalse(t4.contains(2)); 
		assertTrue(ts4.contains("Welt")); 
		assertTrue(ts4.contains("sch�n")); 
		assertFalse(ts4.contains("Hallo")); 
		assertFalse(ts4.contains("Bier")); 

	}
	@Test
	void heightTest() {
		SearchTree<Integer> t = new SearchTree<Integer>();
		t.add(1); 
		t.add(2);
		t.add(3); 
		assertEquals(3, t.height());

		SearchTree<Integer> t6 = new SearchTree<Integer>();
		t6.add(10); 
		t6.add(5); 
		t6.add(5);
		t6.add(3); 
		t6.add(7); 
		t6.add(6); 
		t6.add(15); 
		t6.add(12);
		t6.add(17); 
		assertEquals(4,t6.height()); 

		SearchTree<Integer> t7 = new SearchTree<Integer>();
		t7.add(0); 
		assertEquals(1,t7.height()); 
	}
	@Test
	void equalStructureTest() {
		TreeNode<Integer> t1 = new TreeNode<Integer>(1, new TreeNode<Integer>(2), new TreeNode<Integer>(3));
		TreeNode<Integer> t2 = new TreeNode<Integer>(1, new TreeNode<Integer>(2), new TreeNode<Integer>(3));
		TreeNode<Integer> t3 = new TreeNode<Integer>(5, new TreeNode<Integer>(8), new TreeNode<Integer>(2));
		TreeNode<Integer> t4 = new TreeNode<Integer>(3, new TreeNode<Integer>(6), new TreeNode<Integer>(1));
		TreeNode<Integer> t5 = new TreeNode<Integer>(1,t3,t4);
		TreeNode<Integer> t6 = new TreeNode<Integer>(4,t3,t5);
		TreeNode<Integer> t7 = new TreeNode<Integer>(null);
		TreeNode<Integer> t8= new TreeNode<Integer>(null);
		TreeNode<Integer> t9 = new TreeNode<Integer>(1,t3,t4);
		assertTrue(t1.equalStructure(t2)); 
		assertTrue(t5.equalStructure(t9));
		assertTrue(t7.equalStructure(t8)); 
		assertFalse(t1.equalStructure(t3)); 
		assertFalse(t4.equalStructure(t7)); 
	}

}