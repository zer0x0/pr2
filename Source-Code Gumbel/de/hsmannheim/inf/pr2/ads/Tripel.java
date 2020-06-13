package de.hsmannheim.inf.pr2.ads;

/*
 * ermöglicht aufruf der Klasse mit unterschiedlichen Param Typen 
 * extends Comparable Interface
 */
public class Tripel<U extends Comparable<U>, W extends Comparable<W>, V extends Comparable<V>> {

	U u;
	V v;
	W w;

	/*
	 * Konstruktor
	 */
	public Tripel(U u, W w, V v) {
		this.u = u;
		this.v = v;
		this.w = w;
	}

}
