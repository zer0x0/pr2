package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TripelComparator<A extends Comparable<A>, B extends Comparable<B>, C extends Comparable<C>>
		implements Comparator<Tripel<A, B, C>> {
	private final int zahl;

	public TripelComparator(final int zahl) {
		this.zahl = zahl;
	}

	/**
	 * Objekterzeugung Tripel x,y,z Collection.sort()-Methode übernimmt die
	 * Sortierung und gibt die Tripel je nach Sortierkriterium aus
	 */
	public static void main(String[] args) {
		int zahl = (int) (Math.random() * 6) + 1;
		final Comparator<Tripel<Integer, Integer, Integer>> cmp = new TripelComparator<Integer, Integer, Integer>(2);

		Tripel<Integer, Integer, Integer> x = new Tripel<>(4, 5, 6);
		Tripel<Integer, Integer, Integer> y = new Tripel<>(8, 5, 6);
		Tripel<Integer, Integer, Integer> z = new Tripel<>(7, 8, 9);
//		Tripel<Integer,Integer,Integer> x = new Tripel<>(7,2,9);
//		Tripel<Integer,Integer,Integer> y = new Tripel<>(7,8,9);

		ArrayList<Tripel<Integer, Integer, Integer>> list = new ArrayList<>();
		list.add(z);
		list.add(y);
//		list.add(z); 
//		for(var element: list) {
//			System.out.println(element);
//		}
		Collections.sort(list, cmp);
		for (var elem : list) {
			System.out.println(elem);
		}
	}

	/*
	 * Methode vergleicht Tripel je nach Zufallszahl 1-6 nach folgendem Kriterien:
	 * 1: nach u,v,w aufsteigend 2: nach u,v,w absteigend 3: nach v,u,w aufsteigend
	 * 4: nach v,u,w absteigend 5: nach w,v,u aufsteigend 6: nach w,v,u absteigend
	 * 
	 * @param x Wert u,v,w des Tripel
	 * 
	 * @param y Wert u,v,w des Tripel
	 * 
	 * @return Die geordneten Tripel
	 **/
	public int compare(Tripel<A, B, C> x, Tripel<A, B, C> y) {
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
			System.out.println("Geht nicht");
		}
		return 0;
	}
}
