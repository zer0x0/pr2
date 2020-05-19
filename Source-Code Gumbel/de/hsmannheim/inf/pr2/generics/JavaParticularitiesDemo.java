package de.hsmannheim.inf.pr2.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Diese Klasse zeigt Beispiele für Design-Besonderheiten
 * rund um Arrays und Generics.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class JavaParticularitiesDemo {

  public static void main(String[] args) {
    rawTypes();
    arrayReified();
    polymorhie();
    wildcard();
  }

  public static void rawTypes() {
      // Alle verwalteten Objekte sind vom Typ Object:
      List list = new ArrayList(); // Liste von Object-Objekten.
      list.add("Hallo");
      list.add(42);
      String text = (String) list.get(0);
      int zahl = (int) list.get(0); // Laufzeitfehler!
  }

  public static void arrayReified() {
      Object[] array = new String[10];
      array[0] = "Hallo";
      array[1] = Integer.valueOf(15); // Laufzeitfehler!
  }

  public static void genericsTypeSafety() {
    // ArrayList<Object> list = new ArrayList<String>(); // Compilerfehler!
    // list.add(new Integer(15));
  }

  public static void polymorhie() {
    // Polymorphie des Arrays:
    Object[] oa1 = new Object[10];
    oa1[0] = "Hallo";
    oa1[1] = new Date();

    // Polymorphie der Referenz:
    Object[] oa2 = new String[5];
    oa2[0] = "Welt";

    // Polymorphie des generischen Typs:
    List<Object> g = new ArrayList<>();
    g.add("Hallo");
    g.add(new Date());
  }

  public static void wildcard() {
    // Menge, die Elemente enthält, die von Object abgeleitet sind:
    Set<?> set = new HashSet<>();
    set.add(null);
    // Geht nicht, da Compilerfehler:
    // set.add(1);
    // set.add("Java");
    // set.add((Object) "Java");

    Set set2 = set; // vor Java 1.5
    set2.add(1); // Jetzt können Elemente eingefügt werden.
    set2.add("Java");

    set = set2; // Und wieder zurück.
    System.out.println(set);
  }
}
