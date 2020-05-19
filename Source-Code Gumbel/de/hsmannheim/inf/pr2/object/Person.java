package de.hsmannheim.inf.pr2.object;

/**
 * Eine sehr einfache Klasse für eine Person,
 * die genügend Attribute enthält, um die Konzepte
 * in der Vorlesung zu verdeutlichen.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class Person implements Comparable<Person> {

  private String name;

  public Person(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * Überprüft, ob ein anderes Objekt dieselbe Person ist.
   *
   * @param other Anderes Objekt.
   * @return Wahr, falls der Name der anderen Person gleich ist,
   * in allen anderen Fällen falsch.
   */
  @Override
  public boolean equals(Object other) {
    // Üblich: auf null und gleiche Klasse überprüfen:
    if (other != null && other instanceof Person) {
      Person person2 = (Person) other;
      return getName().equals(person2.getName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return name;
  }

  /**
   * Vergleicht diese Person mit einer anderen.
   *
   * @param other Andere Person (nicht Objekt!)
   * @return <0, falls der Name anderen Person lexikograpisch
   * kleiner ist, 0 falls gleicher Name oder >0 sonst.
   */
  public int compareTo(Person other) {
    // Strings haben natürlich auch eine compareTo()-Methode:
    return getName().compareTo(other.getName());
  }
}
