package de.hsmannheim.inf.pr2.ads;

/**
 * PÜ4 - Aufgabe 1
 * 
 * @author zer0x0
 *
 * @param <U>
 * @param <W>
 * @param <V>
 */

/*
 * Ermöglicht aufruf der Klasse mit unterschiedlichen Param Typen extends
 * Comparable Interface
 */

public class Tripel<U extends Comparable<U>, W extends Comparable<W>, V extends Comparable<V>> {

	U u;
	V v;
	W w;

	/*
	 * öffentlicher Konstruktor
	 */

	public Tripel(U u, W w, V v) {
		this.u = u;
		this.v = v;
		this.w = w;
	}

	public static void main(String[] args) {
		Tripel<Integer, Integer, Integer> xTripel = new Tripel<Integer, Integer, Integer>(1, 2, 3);
	}

}