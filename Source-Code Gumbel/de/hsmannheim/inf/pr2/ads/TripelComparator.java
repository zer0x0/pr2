package de.hsmannheim.inf.pr2.ads;

import java.util.Comparator;

public class TripelComparator<A extends Comparable<A>, B extends Comparable<B>, C extends Comparable<C>>
		implements Comparator<Tripel<A, B, C>> {
	private final int zahl;

	public TripelComparator(final int zahl) {
		this.zahl = zahl;
	}

	@Override
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
