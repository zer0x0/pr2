package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ListNodeTest {


	@Disabled
	@Test
	void testcontainsIter() {
		List<String> zeichenKetten = new List<String>("Hallo");
		List<Integer> intZahlen = new List<Integer>(1); 
		intZahlen.addLast(1);
		intZahlen.addLast(2);
		intZahlen.addLast(5);
		intZahlen.addLast(8);

		zeichenKetten.addLast("Welt");
		zeichenKetten.addLast("das");
		zeichenKetten.addLast("Wetter");
		zeichenKetten.addLast("ist");
		zeichenKetten.addLast("sch�n");

		assertTrue(intZahlen.containsIter(1)); 
		assertTrue(intZahlen.containsIter(8)); 
		//		assertTrue(intZahlen.containsIter(3)); 
		assertTrue(zeichenKetten.containsIter("Hallo")); 
		//		assertTrue(zeichenKetten.containsIter("Pro")); 
	}

	@Test
	void testcontains() {
		List<String> zeichenKetten = new List<String>("Hallo");
		List<Integer> intZahlen = new List<Integer>(1); 
		intZahlen.addLast(1);
		intZahlen.addLast(2);
		intZahlen.addLast(5);
		intZahlen.addLast(8);

		zeichenKetten.addLast("Welt");
		zeichenKetten.addLast("das");
		zeichenKetten.addLast("Wetter");
		zeichenKetten.addLast("ist");
		zeichenKetten.addLast("sch�n");

		assertTrue(intZahlen.contains(1)); 
		assertTrue(intZahlen.contains(9));
		assertTrue(zeichenKetten.contains("Hallo")); 
		assertTrue(zeichenKetten.contains("Banane")); 
	}

}

