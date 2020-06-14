package de.hsmannheim.inf.pr2.ads;

import java.util.TreeSet;
import java.util.HashSet;

/**
 * 
 * PÜ4 - Aufgabe 
 * 
 * @author zer0x0
 *
 */

public class StringGeneratorFINAL {

	public static String stringGen(int groesse) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		/*
		 * StringBuffer size von AlphaNumericString wird erzeugt. generiert eine random
		 * Number zwischen 0 und AlphaNumericString.length.
		 */
		StringBuilder sb = new StringBuilder(groesse);
		for (int i = 0; i < groesse; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());

			/*
			 * Charakterweise hinzufügen am Ende des sb --> char f�r char add Character one
			 * by one in end of sb (sb = StringBuilder)
			 */

			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	/*
	 * Berechnung der Laufzeit für die Add-Methode (HashSet)
	 */
	public static void HashSetLaufZeit(int anzahlIteration) {

		/*
		 * Erstellung eines Hashsets als Objekt mit dem Namen - Hashset
		 */
		HashSet<String> hashSet = new HashSet<String>();

		/*
		 * Startzeit setzen
		 */
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i <= anzahlIteration; i++) {
			hashSet.add(stringGen(8));
		}

		/*
		 * Endzeit
		 */
		Long endTime = System.currentTimeMillis();

		/*
		 * Berechnung der Laufzeit für das Einfügen
		 */
		Long laufZeit = endTime - startTime;

		System.out.println(
				"Laufzeit fuer HashSet (Add-Methode) bei n = " + anzahlIteration + " Wiederholungen: " + laufZeit);

	}

	/*
	 * Berechnung der Laufzeit für die Add-Methode (TreeSet)
	 */
	public static void TreeSetLaufZeit(int anzahlIteration) {

		/*
		 * Erstellung eines TreeSets als Objekt mit dem Namen - Hashset
		 */
		TreeSet<String> treeSet = new TreeSet<String>();

		/*
		 * Startzeit setzen
		 */
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i <= anzahlIteration; i++) {
			treeSet.add(stringGen(8));
		}
		/*
		 * Endzeit
		 */
		Long endTime = System.currentTimeMillis();

		/*
		 * Berechnung der Laufzeit für das Einfügen
		 */
		Long laufZeit = endTime - startTime;

		System.out.println(
				"Laufzeit fuer TreeSet (Add-Methode) bei n = " + anzahlIteration + " Wiederholungen: " + laufZeit);

	}

	/*
	 * Berechnung der Laufzeit für die Contains-Methode (TreeSet)
	 */
	public static void HashSetLaufZeitContains(int anzahlIteration) {

		/*
		 * Erstellung eines Hashsets als Objekt mit dem Namen - Hashset
		 */
		HashSet<String> hashSet = new HashSet<String>();

		/*
		 * Startzeit setzen
		 */
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i <= anzahlIteration; i++) {
			hashSet.add(stringGen(8));
		}

		hashSet.contains(stringGen(8));

		/*
		 * Endzeit
		 */
		Long endTime = System.currentTimeMillis();

		/*
		 * Berechnung der Laufzeit für das Einfügen
		 */
		Long laufZeit = endTime - startTime;

		System.out.println(
				"Laufzeit fuer HashSet (Contains-Methode) bei n = " + anzahlIteration + " Wiederholungen: " + laufZeit);

	}

	/*
	 * Berechnung der Laufzeit für die Contains-Methode (TreeSet)
	 */
	public static void TreeSetLaufZeitContains(int anzahlIteration) {

		/*
		 * Erstellung eines TreeSets als Objekt mit dem Namen - Hashset
		 */
		TreeSet<String> treeSet = new TreeSet<String>();

		/*
		 * Startzeit setzen
		 */
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i <= anzahlIteration; i++) {
			treeSet.add(stringGen(8));
		}

		treeSet.contains(stringGen(8));

		/*
		 * Endzeit
		 */
		Long endTime = System.currentTimeMillis();

		/*
		 * Berechnung der Laufzeit für das Einfügen
		 */
		Long laufZeit = endTime - startTime;

		System.out.println(
				"Laufzeit fuer TreeSet (Contains-Methode) bei n = " + anzahlIteration + " Wiederholungen: " + laufZeit);

	}

	public static void main(String[] args) {

		int n = 100;
		int m = 1000;
		int k = 10000;
		int j = 100000;
		int l = 1000000;

		HashSetLaufZeit(n);
		TreeSetLaufZeit(n);

		System.out.println();

		HashSetLaufZeit(m);
		TreeSetLaufZeit(m);

		System.out.println();

		HashSetLaufZeit(k);
		TreeSetLaufZeit(k);

		System.out.println();

		HashSetLaufZeit(j);
		TreeSetLaufZeit(j);

		System.out.println();

		HashSetLaufZeit(l);
		TreeSetLaufZeit(l);

		System.out.println();
		System.out.println();

		HashSetLaufZeitContains(n);
		TreeSetLaufZeitContains(n);

		System.out.println();

		HashSetLaufZeitContains(m);
		TreeSetLaufZeitContains(m);

		System.out.println();

		HashSetLaufZeitContains(k);
		TreeSetLaufZeitContains(k);

		System.out.println();

		HashSetLaufZeitContains(j);
		TreeSetLaufZeitContains(j);

		System.out.println();

		HashSetLaufZeitContains(l);
		TreeSetLaufZeitContains(l);

		System.out.println();

	}

}
