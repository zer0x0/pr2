package de.hsmannheim.inf.pr2.cf;

import de.hsmannheim.inf.pr2.object.Person;
import java.util.*;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class CollectionCaution {

  public static void main(String[] args) {
    sideeffect();
    sideeffectOrder();
    equalObjects();
  }

  public static void sideeffect() {
    List<Person> list = new ArrayList<>();
    list.add(new Person("Homer"));
    Person march = new Person("March");
    list.add(march);
    System.out.println(list.toString());

    march.setName("Marge"); // Name war falsch!
    System.out.println(list.toString());
  }

  public static void sideeffectOrder() {
    Set<Person> set = new TreeSet<>();
    set.add(new Person("Homer"));
    Person march = new Person("Garge");
    set.add(march);
    System.out.println(set.toString()); // Sortiert!

    march.setName("Marge"); // Name war falsch!
    System.out.println(set.toString());
  }

  public static void equalObjects() {
    Set<Person> set = new HashSet<>();
    Person homer = new Person("Homer");
    set.add(homer);
    set.add(new Person("Marge"));

    Person homer2 = new Person("Homer");
    set.add(homer2); // Noch ein Homer wird hinzugefügt.

    System.out.println(set.toString());
    System.out.println(homer == homer2);
    System.out.println(homer.equals(homer2));
  }
}
