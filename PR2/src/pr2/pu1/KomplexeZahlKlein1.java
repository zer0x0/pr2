package pr2.pu1;

public class KomplexeZahlKlein1 extends KomplexeZahlen {

	public KomplexeZahlKlein1(double real, double img) throws Exception {
		super(real, img);

		if (img > 10) {
			throw new Exception("die Zahl für den imaginären Anteil ist zu groß. Der Reelezahl ist " + real + " groß.");
		}

	}

}