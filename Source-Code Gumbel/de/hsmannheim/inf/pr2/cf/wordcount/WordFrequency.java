package de.hsmannheim.inf.pr2.cf.wordcount;

/**
 * Klasse für die Verwaltung der Worthäufigkeiten.
 *
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
// TODO: Sortierbar machen (Comparable)
public class WordFrequency {

  /**
   * Das Wort.
   */
  String word;

  /**
   * Seine Häufigkeit.
   */
  int frequency;

  /**
   * Legt ein neues Objekt an.
   *
   * @param word      das gespeicherte Wort
   * @param frequency die Häufigkeit
   */
  WordFrequency(String word, int frequency) {
    this.word = word;
    this.frequency = frequency;
  }

  /**
   * Erhöht die Häufigkeit des Wortes.
   */
  public void incrementFrequency() {
    frequency++;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.format("%s: %d", word, frequency);
  }
}
