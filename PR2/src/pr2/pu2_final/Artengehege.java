package pr2.pu2_final;

import java.util.ArrayList;
import java.util.List;

public class Artengehege<T extends Tier> {

	protected List<Tier> tiergehege;

	/**
	 * Artengehege-Konstruktor
	 */
	protected Artengehege() {
		this.tiergehege = new ArrayList<>();
	}

	public static void main(String[] args) {
		Artengehege<Hase> hasenstall = new Artengehege<>();
		Hase h1 = new Hase();
		Hase h2 = new Hase();
		Hase h3 = new Hase();
		// Tier t1 = new Hase();

		// hasenstall.einsperren(t1); // funktioniert nicht - Compilerfehler!
		hasenstall.einsperren(h1);
		hasenstall.einsperren(h2);
		hasenstall.einsperren(h3);

	}

	/**
	 * einsperren()-Methode um Tiere in die Liste hinzu zufuegen bzw.
	 * einzuszusperren
	 * 
	 * @param tier Instanz von dem Typ Tier
	 */
	public void einsperren(T tier) {
		/**
		 * vergleich von datentyp tier mit dem datentyp vom 1. Objekt im Tiergehege ||
		 * tiergehege ist leer
		 */
		if (tiergehege.size() == 0) {
			this.tiergehege.add(tier);

		} else if (tier.getClass().equals(tiergehege.get(0).getClass())) {
			this.tiergehege.add(tier);

		}

	}

}
