package de.hsmannheim.inf.pr2.ads.demo;

/**
 * Ein Monat; wird als Beispiel für Hashing benutzt.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Monat {

  private int hashCode = 0;
  private String name;

  public Monat(String name) {
    if (name.length() >= 3) {
      this.name = name;
      String upperName = name.toUpperCase();
      int c1 = upperName.charAt(0) - 'A' + 1;
      int c2 = upperName.charAt(1) - 'A' + 1;
      int c3 = upperName.charAt(2) - 'A' + 1;
      hashCode = c1 + c2 + c3;
    } else {
      // Fehlermeldung, da zu kurz.
      throw new RuntimeException("Ungültiger Monatsname: " + name);
    }
  }

  /**
   * Gibt den Hashcode für diesen Monat zurück.
   *
   * @return Die ersten drei Buchstabenwerte addiert.
   */
  public int hashCode() {
    return hashCode;
  }

  /**
   * Vergleicht dieses Monats-Objekt mit irgendeinem anderen.
   *
   * @param other Andere Objekt
   * @return True, falls das andere ebenfalls vom Typ Monat
   * und inhaltlich gleich ist, d.h. der Name ist gleich.
   */
  public boolean equals(Object other) {
    if (other != null && other instanceof Monat) {
      Monat otherMonat = (Monat) other;
      return otherMonat.name.equals(this.name);
    }
    return false;
  }

  public String toString() {
    return name + " (" + hashCode + ")";
  }
}
