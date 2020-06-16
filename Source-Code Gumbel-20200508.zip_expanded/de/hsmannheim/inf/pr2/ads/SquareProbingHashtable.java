package de.hsmannheim.inf.pr2.ads;

/**
 * Eine Hashtable, die quadratisches Sondieren unterstützt.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SquareProbingHashtable<E> extends Hashtable<E> {

  /**
   * Erzeugt eine Hashtabelle der Kapazität 100, die
   * quadratisches Sondieren nutzt.
   */
  public SquareProbingHashtable() {
    this(100);
  }

  /**
   * Erzeugt eine Hashtabelle mit der Kapazität capacity,
   * die quadratisches Sondieren verwendet.
   *
   * @param capacity Die interne Größe des genutzten Arrays.
   */
  public SquareProbingHashtable(int capacity) {
    super(capacity);
  }

  /**
   * Quadratisches Sondieren.
   *
   * @param idx Ursprünglicher Indexplatz, bei dem Kollision auftritt.
   * @param i   i-tes Sondieren
   * @return Neuer Indexplatz.
   */
  @Override
  protected int hash(int idx, int i) {
    return (idx + i * i) % hashtable.length;
  }
}
