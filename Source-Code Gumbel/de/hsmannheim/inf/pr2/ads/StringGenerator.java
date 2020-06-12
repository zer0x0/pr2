package de.hsmannheim.inf.pr2.ads;

import java.util.TreeSet;
import java.util.HashSet;

public class StringGenerator {

	public static String stringGen() {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

// create StringBuffer size of AlphaNumericString 
		StringBuilder sb = new StringBuilder(8);

		for (int i = 0; i < 8; i++) {

// generate a random number between 
// 0 to AlphaNumericString variable length 
			int index = (int) (AlphaNumericString.length() * Math.random());

// add Character one by one in end of sb (String = Builder)
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 100;
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = stringGen();
		}
		TreeSet<String> treeSet = new TreeSet<String>();
		HashSet<String> hashSet = new HashSet<String>();
		/**
		 * Zeitmessung wie lange das Hinzufügen zu TreeSet dauert
		 */
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < stringArray.length; i++) {
			treeSet.add(stringArray[i]);

		}
		/**
		 * Zeitmessung wie lange das Hinzufügen zu HashSet dauert
		 */
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < stringArray.length; i++) {
			hashSet.add(stringArray[i]);

		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		/*
		 * Messung mit doppelter Anzahl von Wörtern
		 * 
		 */

		String[] stringArray2 = new String[n * 2];
		for (int i = 0; i < n * 2; i++) {
			stringArray2[i] = stringGen();
		}
		TreeSet<String> treeSet2 = new TreeSet<String>();
		HashSet<String> hashSet2 = new HashSet<String>();
		/**
		 * Zeitmessung wie lange das Hinzufügen zu TreeSet dauert (Doppelte Anzahl Wörter)
		 */
		startTime = System.currentTimeMillis();
		for (int i = 0; i < stringArray2.length; i++) {
			treeSet2.add(stringArray2[i]);
		}
		/**
		 * Zeitmessung wie lange das Hinzufügen zu HashSet dauert (Doppelte Anzahl Wörter)
		 */
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < stringArray2.length; i++) {
			hashSet2.add(stringArray2[i]);

		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
