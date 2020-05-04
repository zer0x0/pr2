package pr2.pu1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pr2.pu1.KomplexeZahlKlein2.KZKException;

class KomplexeZahlenJUnitTest {

	@Test
	void testGetter() {
		KomplexeZahlen x = new KomplexeZahlen(2.5, 4.5);
		assertEquals(2.5, x.re());
		assertEquals(4.5, x.im());
	}

	@Test
	void testAdd() {
		/*
		 * x1 && y1
		 */
		KomplexeZahlen y = new KomplexeZahlen(2.5, 4.5);
		/*
		 * x2 && y2
		 */
		KomplexeZahlen z = new KomplexeZahlen(2.5, 4.5);
		/*
		 * 5 vor Komma && 9 nach Komma in der Gleichung auf Aufgabenblatt (Aufgabe 3)
		 */
		KomplexeZahlen er = new KomplexeZahlen(5, 9);
		/*
		 * er.im -> getter imaginäre Zahl im y.prod(z) -> Addition von y && z .im() ->
		 * getter Resultat imaginäre Zahl
		 */
		assertEquals(er.im(), y.add(z).im());
		/*
		 * er.re -> getter reelle Zahl re y.prod(z) -> Multiplikation von y && z .re()
		 * -> getter Resultat reelle Zahl
		 */
		assertEquals(er.re(), y.add(z).re());

	}

	@Test
	void testAddStatic() {

		KomplexeZahlen x = new KomplexeZahlen(2.5, 3.5);
		KomplexeZahlen y = new KomplexeZahlen(2.5, 4.5);
		KomplexeZahlen ergebnis = new KomplexeZahlen(5.0, 9.0);
		assertEquals(ergebnis.im(), KomplexeZahlen.add1(x, y).im());
		assertEquals(ergebnis.re(), KomplexeZahlen.add1(x, y).re());
	}

	@Test
	void testProd() {
		/*
		 * x1 && y1
		 */
		KomplexeZahlen y = new KomplexeZahlen(2.5, 4.5);
		/*
		 * x2 && y2
		 */
		KomplexeZahlen z = new KomplexeZahlen(2.5, 4.5);
		/*
		 * -14 vor Komma && 22.5 nach Komma in der Gleichung auf Aufgabenblatt (Aufgabe
		 * 4)
		 */
		KomplexeZahlen er = new KomplexeZahlen(-14, 22.5);
		/*
		 * er.im -> getter imaginäre Zahl im y.prod(z) -> Multiplikation von y && z
		 * .im() -> getter Resultat imaginäre Zahl
		 */
		assertEquals(er.im(), y.prod(z).im());
		/*
		 * er.re -> getter reelle Zahl re y.prod(z) -> Addition von y && z .re() ->
		 * getter Resultat reelle Zahl
		 */
		assertEquals(er.re(), y.prod(z).re());
	}

	@Test
	void testProdStatic() {

		KomplexeZahlen x = new KomplexeZahlen(2.5, 4.5);
		KomplexeZahlen y = new KomplexeZahlen(2.5, 4.5);
		KomplexeZahlen ergebnis = new KomplexeZahlen(-14, 22.5);
		assertEquals(ergebnis.im(), KomplexeZahlen.prod1(x, y).im());
		assertEquals(ergebnis.re(), KomplexeZahlen.prod1(x, y).re());
	}

	@Test
	void testExceptionKomplexeZahlKlein1() {
		/*
		 * ab imaginären Teil >10 (11)
		 */
		assertThrows(Exception.class, () -> new KomplexeZahlKlein1(2.5, 11));

	}

	/*
	 * haben es nicht hinbekommen ... weil eigene exception in ner innere klasse
	 * ...can not be resolved to a type fragen wir beim tutor...
	 */
	@Test
	void testExceptionKZKException() {
		KZKException exception = assertThrows(KZKException.class, () -> new KomplexeZahlKlein2(2.5, 11));
		assertTrue(
				exception.getMessage().contains("Die Zahl für den imaginären Anteil ist zu groß. Der Reelezahl ist"));

	}
}
