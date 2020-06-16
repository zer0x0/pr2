package de.hsmannheim.inf.pr2.io.board;

/**
 * Farben der Spielsteine.
 *
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 */
public enum Color {

  /**
   * Schwarzer Stein.
   */
  BLACK,

  /**
   * Weißer Stein.
   */
  WHITE;

  /**
   * @see java.lang.Enum#toString()
   */
  @Override
  public String toString() {
    if (this == Color.BLACK) {
      return "B";
    } else {
      return "W";
    }
  }
}
