package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

class TripelComparatorTest {

	@Test
	void testCase1() {
		int zahl = 1;
		final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl); 
		
		Tripel<Integer,Integer,Integer> x = new Tripel<>(10,11,12);
		Tripel<Integer,Integer,Integer> y = new Tripel<>(4,5,6);
		
		Tripel<Integer,Integer,Integer> a = new Tripel<>(7,2,9);
		Tripel<Integer,Integer,Integer> b = new Tripel<>(7,8,9);
		
		Tripel<Integer,Integer,Integer> c = new Tripel<>(7,2,3);
		Tripel<Integer,Integer,Integer> d = new Tripel<>(7,2,9);
		
		
		ArrayList<Tripel<Integer, Integer, Integer>> listActual = new ArrayList<>(); 
		ArrayList<Tripel<Integer, Integer, Integer>> listExpected = new ArrayList<>(); 
		
		listActual.add(x); 
		listActual.add(y);
		
		listExpected.add(y); 
		listExpected.add(x); 
		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
		
		listActual.clear();
		listExpected.clear();
		
		listActual.add(a); 
		listActual.add(b); 
		
		listExpected.add(a); 
		listExpected.add(b); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	
		listActual.clear();
		listExpected.clear();
		
		listActual.add(c); 
		listActual.add(d); 
		
		listExpected.add(c); 
		listExpected.add(d); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);

	}
	@Test
	void testCase2() {
		int zahl = 2;
		final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl); 
		
		Tripel<Integer,Integer,Integer> x = new Tripel<>(4,5,6);
		Tripel<Integer,Integer,Integer> y = new Tripel<>(10,11,12);
		
		Tripel<Integer,Integer,Integer> a = new Tripel<>(7,10,9);
		Tripel<Integer,Integer,Integer> b = new Tripel<>(7,8,9);
		
		Tripel<Integer,Integer,Integer> c = new Tripel<>(7,8,11);
		Tripel<Integer,Integer,Integer> d = new Tripel<>(7,8,9);
		
		
		ArrayList<Tripel<Integer, Integer, Integer>> listActual = new ArrayList<>(); 
		ArrayList<Tripel<Integer, Integer, Integer>> listExpected = new ArrayList<>(); 
		
		listActual.add(x); 
		listActual.add(y);
		
		listExpected.add(y); 
		listExpected.add(x); 
		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
		
		listActual.clear();
		listExpected.clear();
		
		listActual.add(a); 
		listActual.add(b); 
		
		listExpected.add(a); 
		listExpected.add(b); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	
		listActual.clear();
		listExpected.clear();
		
		listActual.add(c); 
		listActual.add(d); 
		
		listExpected.add(c); 
		listExpected.add(d); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	}
	@Test
	void testCase3() {
		int zahl = 3;
		final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl); 
		
		Tripel<Integer,Integer,Integer> x = new Tripel<>(6,11,12);
		Tripel<Integer,Integer,Integer> y = new Tripel<>(6,5,7);
		
		Tripel<Integer,Integer,Integer> a = new Tripel<>(7,2,3);
		Tripel<Integer,Integer,Integer> b = new Tripel<>(12,2,9);
		
		Tripel<Integer,Integer,Integer> c = new Tripel<>(7,2,3);
		Tripel<Integer,Integer,Integer> d = new Tripel<>(7,2,9);
		
		
		ArrayList<Tripel<Integer, Integer, Integer>> listActual = new ArrayList<>(); 
		ArrayList<Tripel<Integer, Integer, Integer>> listExpected = new ArrayList<>(); 
		
		listActual.add(x); 
		listActual.add(y);
		
		listExpected.add(y); 
		listExpected.add(x); 
		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
		
		listActual.clear();
		listExpected.clear();
		
		listActual.add(a); 
		listActual.add(b); 
		
		listExpected.add(a); 
		listExpected.add(b); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	
		listActual.clear();
		listExpected.clear();
		
		listActual.add(c); 
		listActual.add(d); 
		
		listExpected.add(c); 
		listExpected.add(d); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	}
	@Test
	void testCase4() {
		int zahl = 4;
		final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl); 
		
		Tripel<Integer,Integer,Integer> x = new Tripel<>(4,11,12);
		Tripel<Integer,Integer,Integer> y = new Tripel<>(4,5,6);
		
		Tripel<Integer,Integer,Integer> a = new Tripel<>(7,2,9);
		Tripel<Integer,Integer,Integer> b = new Tripel<>(3,2,4);
		
		Tripel<Integer,Integer,Integer> c = new Tripel<>(7,2,3);
		Tripel<Integer,Integer,Integer> d = new Tripel<>(7,2,9);
		
		
		ArrayList<Tripel<Integer, Integer, Integer>> listActual = new ArrayList<>(); 
		ArrayList<Tripel<Integer, Integer, Integer>> listExpected = new ArrayList<>(); 
		
		listActual.add(x); 
		listActual.add(y);
		
		listExpected.add(x); 
		listExpected.add(y); 
		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
		
		listActual.clear();
		listExpected.clear();
		
		listActual.add(a); 
		listActual.add(b); 
		
		listExpected.add(a); 
		listExpected.add(b); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	
		listActual.clear();
		listExpected.clear();
		
		listActual.add(c); 
		listActual.add(d); 
		
		listExpected.add(d); 
		listExpected.add(c); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	}
	@Test
	void testCase5() {
		int zahl = 5;
		final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl); 
		
		Tripel<Integer,Integer,Integer> x = new Tripel<>(4,11,12);
		Tripel<Integer,Integer,Integer> y = new Tripel<>(4,11,6);
		
		Tripel<Integer,Integer,Integer> a = new Tripel<>(1,2,9);
		Tripel<Integer,Integer,Integer> b = new Tripel<>(7,8,9);
		
		Tripel<Integer,Integer,Integer> c = new Tripel<>(1,2,9);
		Tripel<Integer,Integer,Integer> d = new Tripel<>(7,2,9);
		
		
		ArrayList<Tripel<Integer, Integer, Integer>> listActual = new ArrayList<>(); 
		ArrayList<Tripel<Integer, Integer, Integer>> listExpected = new ArrayList<>(); 
		
		listActual.add(x); 
		listActual.add(y);
		
		listExpected.add(y); 
		listExpected.add(x); 
		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
		
		listActual.clear();
		listExpected.clear();
		
		listActual.add(a); 
		listActual.add(b); 
		
		listExpected.add(a); 
		listExpected.add(b); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	
		listActual.clear();
		listExpected.clear();
		
		listActual.add(c); 
		listActual.add(d); 
		
		listExpected.add(c); 
		listExpected.add(d); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	}
	@Test
	void testCase6() {
		int zahl = 6;
		final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl); 
		
		Tripel<Integer,Integer,Integer> x = new Tripel<>(10,11,12);
		Tripel<Integer,Integer,Integer> y = new Tripel<>(4,5,6);
		
		Tripel<Integer,Integer,Integer> a = new Tripel<>(7,2,9);
		Tripel<Integer,Integer,Integer> b = new Tripel<>(7,8,9);
		
		Tripel<Integer,Integer,Integer> c = new Tripel<>(7,2,9);
		Tripel<Integer,Integer,Integer> d = new Tripel<>(1,2,9);
		
		
		ArrayList<Tripel<Integer, Integer, Integer>> listActual = new ArrayList<>(); 
		ArrayList<Tripel<Integer, Integer, Integer>> listExpected = new ArrayList<>(); 
		
		listActual.add(x); 
		listActual.add(y);
		
		listExpected.add(x); 
		listExpected.add(y); 
		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
		
		listActual.clear();
		listExpected.clear();
		
		listActual.add(a); 
		listActual.add(b); 
		
		listExpected.add(b); 
		listExpected.add(a); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	
		listActual.clear();
		listExpected.clear();
		
		listActual.add(c); 
		listActual.add(d); 
		
		listExpected.add(c); 
		listExpected.add(d); 

		Collections.sort(listActual, cmp);
		assertEquals(listExpected, listActual);
	}
}
