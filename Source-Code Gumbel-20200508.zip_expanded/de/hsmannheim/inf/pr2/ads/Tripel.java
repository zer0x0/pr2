package de.hsmannheim.inf.pr2.ads;

public class Tripel <A extends Comparable<A>,B extends Comparable<B>,C extends Comparable<C>> {

	A u; 
	B v; 
	C w; 

	public Tripel(A u, B v, C w) {
		this.u = u; 
		this.v = v; 
		this.w = w;

	}

	public String toString() {
		return u + "/" + v + "/" + w; 
	}

}
