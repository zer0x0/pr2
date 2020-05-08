package pr2.pu2_final;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zoo<T extends Tier> implements Iterable<Tier> {

	/**
	 * neue Map erstellen
	 */
	Map<String, Artengehege<? extends Tier>> map = new HashMap<>();

	/**
	 * Methode um Werte der Map hinzuzufuegen
	 * 
	 * @param key String
	 * @param art Artengehege
	 */
	public void mapInput(String key, Artengehege<? extends Tier> art) {
		map.put(key, art);
	}

	/**
	 * iterator()-Methode wird uebernommen vom Interface Iterable Hilfsliste
	 * List<Tier> tierListe zum Zwischenspeichern 1. For-Each Schleife durchlaeuft
	 * alle Gehege und liefert die Werte ueber map.values() 2. For-Each Schleife
	 * durchlaeuft alle Werte und speichert diese in der Hilfsliste �ber eine
	 * anonyme innere Klasse wird der Comparator realisiert und die Sortierung der
	 * Objekte festgelegt.
	 */
	@Override
	public Iterator<Tier> iterator() {
		List<Tier> tierListe = new ArrayList<Tier>();
		for (Artengehege<? extends Tier> gehege : map.values()) {
			for (Tier tiere : gehege.tiergehege) {
				tierListe.add(tiere);
				Collections.sort(tierListe, new Comparator<Tier>() {

					@Override
					public int compare(Tier o1, Tier o2) {
						return o2.lebensenergie - o1.lebensenergie;
						if (o1.lebensenergie < o2.lebensenergie) {
//							return 1;
//						} else if (o1.lebensenergie == o2.lebensenergie) {
//							return 0;
//						} else {
//							return -1;
//						}
					}
				});
			}
		}
		return tierListe.iterator();

	}

	public static void main(String[] args) {
		Artengehege<Tier> neuesGehege = new Artengehege<>();
		Tier affe = new Tier();
		Tier giraffe = new Tier();
		Tier hund = new Tier();
		Hase hase = new Hase();
		Artengehege<Tier> Gehege2 = new Artengehege<>();
		Gehege2.einsperren(hase);
		neuesGehege.einsperren(affe);
		neuesGehege.einsperren(giraffe);
		neuesGehege.einsperren(hund);

		Zoo<Tier> z1 = new Zoo<>();
		z1.mapInput("Affenstall", neuesGehege);
		z1.mapInput("Hasenstall", Gehege2);
		for (Tier animals : z1) {
			System.out.println(animals.getClass());
			System.out.println(animals.lebensenergie);
		}
	}
}
