package pr2.pu1;

public class KomplexeZahlKlein2 extends KomplexeZahlen {

	public KomplexeZahlKlein2(double real, double img) {
		super(real, img);

		try {
			if (img > 10) {
				throw new KZKException();
			}
		} catch (KZKException KZKException) {
			KZKException.getMessage();
		}

	}

	/*
	 * Neue Exception welche getMessage() überschreibt
	 */
	class KZKException extends Exception {
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "Die Zahl für den imaginären Anteil ist zu groß. Der Reelezahl ist" + re();
		}
	}

}
