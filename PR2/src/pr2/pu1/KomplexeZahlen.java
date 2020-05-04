package pr2.pu1;

public class KomplexeZahlen {

	private double real;
	private double img;

	private static double real1;
	private static double img1;

	/*
	 * Konstruktor 
	 */
	public KomplexeZahlen(double real, double img) {
		this.img = img;
		this.real = real;
	}

	/*
	 * Getter (Mutator) von Klassenvariablen
	 */
	public double im() {
		return img;
	}

	public double re() {
		return real;
	}

	/*
	 * Getter (Mutator) für statische Variablen
	 */
	public static double im1() {
		return img1;
	}

	public static double re1() {
		return real1;
	}

	/* 
	 * String Methode wird überschrieben
	 */
	@Override
	public String toString() {
		return "x" + " = " + real + " + " + img + "i";
	}

	/*
	 * Dynamische Methoden
	 */

	public KomplexeZahlen add(KomplexeZahlen kZahlen) {
		return new KomplexeZahlen(this.real + kZahlen.real, this.img + kZahlen.img);
	}

	public KomplexeZahlen prod(KomplexeZahlen kZahlen) {
		return new KomplexeZahlen((this.real * kZahlen.real) - (this.img * kZahlen.img),
				(this.real * kZahlen.img) + (this.img * kZahlen.real));
	}

	/*
	 * Statische Methoden
	 *
	 * Eine statische Methode wird über die Klasse aufgerufen, 
	 * in der sie definiert ist und zwar erfolgt der Aufruf über 
	 * den Namen der Klasse: Klassenname.
	 */

	public static KomplexeZahlen add1(KomplexeZahlen x, KomplexeZahlen y) {
        return new KomplexeZahlen(x.real + y.real, x.img + y.img);

    }
    public static KomplexeZahlen prod1(KomplexeZahlen x, KomplexeZahlen y) {
        return new KomplexeZahlen(x.real * y.real - x.img * y.img, y.real * x.img + y.img * x.real); 
    }

	public static void main(String[] args) throws Exception {

		// KomplexeZahlen x = new KomplexeZahlen(2.5, 4.5);
//		KomplexeZahlen y = new KomplexeZahlen(3.5, 9.5);
//		System.out.println(x.toString());
//		System.out.println(x.add(y));
//		System.out.println(x.prod(y));

		/*
		 * Komplexe Zahlen 3er Bloecke
		 */

		KomplexeZahlen c1 = new KomplexeZahlen(3.5, 4.5);
		KomplexeZahlen c2 = new KomplexeZahlen(9.5, 10.5);
		KomplexeZahlen c3 = new KomplexeZahlen(11.5, 12.5);

		System.out.println("1: " + c1.toString());
		System.out.println("2: " + c2.toString());
		System.out.println("3: " + c3.toString());

//		System.out.println("4: " + c1.add1());
		System.out.println("5: " + c1.add(c2));

//		System.out.println("6: " + c2.add1());
		System.out.println("7: " + c2.add(c3));

//		System.out.println("8: " + c3.add1());
		System.out.println("9: " + c3.add(c1));

		System.out.println("10: " + c1.prod(c2));
//		System.out.println("11: " + c1.prod1());

		System.out.println("12: " + c2.prod(c3));
//		System.out.println("13: " + c2.prod1());

		System.out.println("14: " + c3.prod(c1));
//		System.out.println("15: " + c3.prod1());

		/* abgeleitete Klassen von KomplexeZahlen */

		KomplexeZahlKlein1 c4 = new KomplexeZahlKlein1(3.5, 4.5);
		KomplexeZahlKlein1 c5 = new KomplexeZahlKlein1(9.5, 10.5);
		KomplexeZahlKlein1 c6 = new KomplexeZahlKlein1(11.5, 12.5);

		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());

		KomplexeZahlKlein2 c7 = new KomplexeZahlKlein2(3.5, 4.5);
		KomplexeZahlKlein2 c8 = new KomplexeZahlKlein2(9.5, 10.5);
		KomplexeZahlKlein2 c9 = new KomplexeZahlKlein2(11.5, 12.5);

		System.out.println(c7.toString());
		System.out.println(c8.toString());
		System.out.println(c9.toString());

		ReelleZahl c10 = new ReelleZahl(2.5, 3.5);
		System.out.println(c10.toString());

	}
}
