package de.hsmannheim.inf.pr2.object;

/**
 * Ein Ork.
 *
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Ork extends Wesen {

  /**
   * Stärke der Orks.
   */
  private static final int ORK_STAERKE = 17;

  /**
   * Zeigt an, ob der Ork gut oder böse ist.
   */
  private boolean boese;

  /**
   * Legt einen neuen Ork an.
   *
   * @param name  Name des Orks.
   * @param boese zeigt an, ob der Ork gut oder böse ist
   */
  public Ork(String name, boolean boese) {
    super(name, ORK_STAERKE);
    this.boese = boese;
  }
}
