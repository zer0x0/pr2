package pr2.pu1;

public class ReelleZahl extends KomplexeZahlen {

	public ReelleZahl(double real, double img) {
		/*
		 * vererbter Konstruktor aus Super Klasse (hinter extends)
		 */
		super(real, 0.0);

	}

	@Override
	public String toString() {

		return "Reele Zahl = " + re();
	}

//	public ReelleZahl add(ReelleZahl rz) {
//		return new ReelleZahl(re() + rz.re(), im() + rz.im());
//	}
//
//	public ReelleZahl prod(ReelleZahl rz) {
//		return new ReelleZahl(re() * rz.re(), im() * rz.im());
//	}
//
//	public static ReelleZahl add1() {
//		return new ReelleZahl(re1() + re1(), im1() + im1());
//	}
//
//	public static ReelleZahl prod1() {
//		return new ReelleZahl(re1() * re1(), im1() * im1());
//	}

}
