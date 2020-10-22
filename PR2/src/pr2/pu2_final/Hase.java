package pr2.pu2_final;

import java.text.DecimalFormat;

public class Hase extends Tier {

	static int anzahlHase = 0;

	/**
	 * Hasen-Konstruktor erbt von Tier-Klasse lebensenergie "super()" wird auf 40
	 * gesetzt
	 */

	protected Hase() {
		lebensenergie = 40;
		// super();
	}

	/**
	 * create()-Methode erzeugt neue Haseninstanz und startet dabei nebenlaufiges
	 * Leben der Hasen Hasen-Objekte werden gezaehlt Hasen-Thread wird ueber
	 * df.format und setName()-Methode fortlaufent nummeriert und benannt
	 * 
	 * @return Hasen-Objekt
	 */
	public static synchronized Hase create() {
// synchronized hat gefehlt
		Hase hi = new Hase();
		hi.id = new Thread(hi);
		anzahlHase++;
		DecimalFormat df = new DecimalFormat("000");
		String c = df.format(anzahlHase);
		String name = "Hase-" + c;
		hi.id.setName(name);
		hi.id.start();
		return hi;
	}
}