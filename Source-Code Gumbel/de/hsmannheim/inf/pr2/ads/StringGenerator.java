package de.hsmannheim.inf.pr2.ads;

import java.util.TreeSet;
import java.util.HashSet;

public class StringGenerator {

	public static String stringGen() {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		/*
		 * StringBuffer size von AlphaNumericString wird erzeugt. generiert eine random
		 * Number zwischen 0 und AlphaNumericString.length.
		 */
		StringBuilder sb = new StringBuilder(8);
		for (int i = 0; i < 8; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());

			/*
			 * Charakterweise hinzufügen am ende des sb --> char für char add Character one
			 * by one in end of sb (sb = StringBuilder)
			 */

			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 100; // --> Wert ändern für Laufzeit vergleich siehe A9.

		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = stringGen();
		}

		TreeSet<String> treeSet = new TreeSet<String>();
		HashSet<String> hashSet = new HashSet<String>();

		/*
		 * Zeitmessung: Wielange dauert das Hinzufügen zu TreeSet.
		 */

		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < stringArray.length; i++) {
			treeSet.add(stringArray[i]);
		}

		/*
		 * Wielange dauert das Hinzufügen zu HashSet.
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
		 */
		String[] stringArray2 = new String[n * 2];
		for (int i = 0; i < n * 2; i++) {
			stringArray2[i] = stringGen();
		}

		TreeSet<String> treeSet2 = new TreeSet<String>();
		HashSet<String> hashSet2 = new HashSet<String>();

		/*
		 * Zeitmessung: wielange das Hinzufügen zu TreeSet dauert --> (n*2)
		 */
		startTime = System.currentTimeMillis();
		for (int i = 0; i < stringArray2.length; i++) {
			treeSet2.add(stringArray2[i]);
		}

		/*
		 * Zeitmessung: wie lange das Hinzufügen zu HashSet dauert --> (n*2)
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
