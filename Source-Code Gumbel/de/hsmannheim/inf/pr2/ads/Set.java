package de.hsmannheim.inf.pr2.ads;

/**
 * Vereinfachtes Set-Interface. Eine Menge ist ebenfalls ein Container. Enthält
 * nur die Methoden, die für die Vorlesung didaktisch relevant sind.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public interface Set<E> extends Container<E> {

	/**
	 * Fügt ein Element der Menge hinzu.
	 * 
	 * @param e Element
	 * @return Wahr, wenn Element hinzufügt wurde, falsch, falls nicht. Das passiert
	 *         u.a., wenn das Element bereits enthalten war.
	 */
	boolean add(E e);

	/**
	 * Entfernt ein Element aus der Menge.
	 * 
	 * @param e Element
	 * @return Wahr, wenn Element enthalten war und entfernt wurde, falsch, falls
	 *         nicht.
	 */
	boolean remove(E e);
}
