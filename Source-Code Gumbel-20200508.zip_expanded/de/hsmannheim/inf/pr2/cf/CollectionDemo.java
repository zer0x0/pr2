package de.hsmannheim.inf.pr2.cf;

import de.hsmannheim.inf.pr2.object.Person;
import java.util.*;
import java.util.LinkedList;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class CollectionDemo {

  public static void main(String[] args) {
    list();
    list2();
    set();
    set2();
    setSorted();
    map();
    iterator();
    sortComparator();
  }

  public static void list() {
    List<String> list = new LinkedList<>();
    list.add("Hallo");
    list.add("Welt");
    list.add("Welt"); // Duplikat
    for (String e : list) { // foreach-Anweisung möglich.
      System.out.print(e + " ");
    }
    System.out.println("\nAnzahl Elemente: " + list.size());
    list.clear(); // Alle Elemente löschen.
    System.out.println("Anzahl Elemente: " + list.size());
  }

  public static void list2() {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      list.add(i); // Zahlen 1 bis 10 hinzufügen...
    }
    for (int e : list) {
      System.out.print(e + " ");
    }
    System.out.println(""); // Neue Zeile.
    list.set(1, 42); // 2. Element austauschen (wie beim Array).
    list.remove(8); // Vorletztes Element (9) löschen.
    list.remove(Integer.valueOf(5)); // Wert 5 löschen.
    for (int e : list) {
      System.out.print(e + " ");
    }
  }

  public static void set() {
    Set<Integer> set = new HashSet<>();
    for (int n = 1; n <= 5; n++) {
      boolean res = set.add(n % 3); // 1, 2, 0, 1, 2
      if (!res) {
        System.out.println(n % 3 + " konnte nicht hinzugefuegt werden.");
      }
    }
    System.out.println(set.toString()); // HashSet hat toString().
    set.remove(1); // Element 1 löschen.
    System.out.println(set.toString());
  }

  public static void set2() {
    Set<String> set = new HashSet<>();
    String[] chord = new String[]{"E", "G#", "H", "D", "E"}; // E7
    for (String note : chord) {
      boolean res = set.add(note);
      if (!res) {
        System.out.println(note + " konnte nicht hinzugefuegt werden.");
      }
    }
    System.out.println(set.toString()); // HashSet hat toString().
    set.remove("D"); // Note D löschen.
    System.out.println(set.toString());
  }

  public static void setSorted() {
    Set<String> set = new TreeSet<>(); // Sortierte Menge.
    String[] chord = new String[]{"E", "G#", "H", "D", "E"}; // E7
    for (String note : chord) {
      boolean res = set.add(note);
      if (!res) {
        System.out.println(note + " konnte nicht hinzugefuegt werden.");
      }
    }
    System.out.println(set.toString()); // HashSet hat toString().
    set.remove("D"); // Note D löschen.
    System.out.println(set.toString());
  }

  public static void map() {
    Map<Integer, String> errorsDE = new HashMap<>();
    Map<Integer, String> errorsEN = new HashMap<>();
    errorsDE.put(1, "Ungueltige Indexposition!");
    errorsDE.put(2, "Teilen durch 0 nicht erlaubt!");
    errorsEN.put(1, "Invalid index position!");
    errorsEN.put(2, "Division by zero error!");

    for (Integer id : errorsDE.keySet()) {
      System.out.println(errorsDE.get(id) + " <=> " +
              errorsEN.get(id));
    }
  }

  public static void iterator() {
    List<String> list = Arrays.asList( // Hilfsmethode
            "Hallo", "Welt!", "Oh", "schoene", "Welt!");
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();
    for (String word : list) { // Alternative Syntax.
      System.out.print(word + " ");
    }
    System.out.println();
    Set<String> set = new HashSet<>(list); // Elemente werden eingefügt.
    for (String word : set) {
      System.out.print(word + " ");
    }
  }

  public static void sortComparator() {
    List<Person> list = new ArrayList<>();
    list.add(new Person("Homer"));
    list.add(new Person("Marge"));
    list.add(new Person("Bart"));
    list.add(new Person("Lisa"));
    list.add(new Person("Maggie"));

    Collections.sort(list); // Kriterium: Person.compareTo()
    System.out.println(list);

    Collections.sort(list, new Comparator<Person>() {
      public int compare(Person p1, Person p2) {
        return p1.getName().length() - p2.getName().length();
      }
    });
    System.out.println(list);
  }

  public static void sortComparatorLambda() {
    List<Person> list = new ArrayList<>();
    list.add(new Person("Homer"));
    list.add(new Person("Marge"));
    list.add(new Person("Bart"));
    list.add(new Person("Lisa"));
    list.add(new Person("Maggie"));

    // Java 8 Lambda:
    Collections.sort(list, (p1, p2) ->
            p1.getName().length() - p2.getName().length());
    System.out.println(list);
  }
}
