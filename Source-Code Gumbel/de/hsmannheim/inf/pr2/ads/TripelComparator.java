package de.hsmannheim.inf.pr2.ads;

import java.util.Comparator;

/**
 * PÜ4 - Aufgabe 1
 * 
 * @author zer0x0
 *
 * @param <U>
 * @param <V>
 * @param <W>
 */

public class TripelComparator<U extends Comparable<U>, V extends Comparable<V>, W extends Comparable<W>>
		implements Comparator<Tripel<U, W, V>> {

	int zahl;

	public TripelComparator(int zahl) {
		this.zahl = zahl;
	}

	public static void main(String[] args) {
		int zahl = (int)(Math.random()*6)+1;
        final Comparator<Tripel<Integer,Integer,Integer>> cmp = new TripelComparator<Integer,Integer,Integer>(zahl);

	}

	@Override
	public int compare(Tripel<U, W, V> x, Tripel<U, W, V> y) {
		switch (zahl) {
		case 1:
			if (x.u.compareTo(y.u) == 1) {
				return 1;
			} else if (x.u.compareTo(y.u) == -1) {
				return -1;
			} else {
				if (x.v.compareTo(y.v) == 1) {
					return 1;
				} else if (x.v.compareTo(y.v) == -1) {
					return -1;
				} else {
					if (x.w.compareTo(y.w) == 1) {
						return 1;
					} else if (x.w.compareTo(y.w) == -1) {
						return -1;
					} else {
						return 0;
					}
				}
			}
		case 2:
			if (x.u.compareTo(y.u) == 1) {
				return -1;
			} else if (x.u.compareTo(y.u) == -1) {
				return 1;
			} else {
				if (x.v.compareTo(y.v) == 1) {
					return -1;
				} else if (x.v.compareTo(y.v) == -1) {
					return 1;
				} else {
					if (x.w.compareTo(y.w) == 1) {
						return -1;
					} else if (x.w.compareTo(y.w) == -1) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		case 3:
			if (x.v.compareTo(y.v) == 1) {
				return 1;
			} else if (x.v.compareTo(y.v) == -1) {
				return -1;
			} else {
				if (x.u.compareTo(y.u) == 1) {
					return 1;
				} else if (x.u.compareTo(y.u) == -1) {
					return -1;
				} else {
					if (x.w.compareTo(y.w) == 1) {
						return 1;
					} else if (x.w.compareTo(y.w) == -1) {
						return -1;
					} else {
						return 0;
					}
				}
			}
		case 4:
			if (x.v.compareTo(y.v) == 1) {
				return -1;
			} else if (x.v.compareTo(y.v) == -1) {
				return 1;
			} else {
				if (x.u.compareTo(y.u) == 1) {
					return -1;
				} else if (x.u.compareTo(y.u) == -1) {
					return 1;
				} else {
					if (x.w.compareTo(y.w) == 1) {
						return -1;
					} else if (x.w.compareTo(y.w) == -1) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		case 5:
			if (x.w.compareTo(y.w) == 1) {
				return 1;
			} else if (x.w.compareTo(y.w) == -1) {
				return -1;
			} else {
				if (x.v.compareTo(y.v) == 1) {
					return 1;
				} else if (x.v.compareTo(y.v) == -1) {
					return -1;
				} else {
					if (x.u.compareTo(y.u) == 1) {
						return 1;
					} else if (x.u.compareTo(y.u) == -1) {
						return -1;
					} else {
						return 0;
					}
				}
			}
		case 6:
			if (x.w.compareTo(y.w) == 1) {
				return -1;
			} else if (x.w.compareTo(y.w) == -1) {
				return 1;
			} else {
				if (x.v.compareTo(y.v) == 1) {
					return -1;
				} else if (x.v.compareTo(y.v) == -1) {
					return 1;

				} else {
					if (x.u.compareTo(y.u) == 1) {
						return -1;
					} else if (x.u.compareTo(y.u) == -1) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		default:
			System.out.println(3634);
		}
		return 0;
	}

}