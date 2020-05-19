package de.hsmannheim.inf.pr2.object;

/**
 * Ein Wesen in der Spielwelt.
 *
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Wesen {

  /**
   * Name des Wesens.
   */
  private String name;

  /**
   * Stärke des Wesens.
   */
  private int staerke;

  /**
   * Legt ein neues Wesen an.
   *
   * @param name    Name des Wesens.
   * @param staerke Stärke des Wesens.
   */
  public Wesen(String name, int staerke) {
    this.name = name;
    this.staerke = staerke;
  }
  /**
   * Erzeugt eine ID (Hashwert) für eine Instanz dieser Klasse.
   * Ein Hashwert sollte für zwei verschiedene Objekte nicht den
   * gleichen Wert liefern.
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + staerke;
    return result;
  }
}
