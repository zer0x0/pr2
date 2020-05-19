package de.hsmannheim.inf.pr2.concurrent.sync;

/**
 * Diese Klasse zeigt, welche Möglichkeiten es gibt,
 * das synchronized-Schlüsselwort zu verwenden.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SyncAlternatives {

  public static void main(String[] args) {
    Foo foo = new Foo();
    // Sperre für Objekt foo wird indirekt angefordert,
    // da method1 synchronized ist:
    foo.method1();

    // Ist das gleiche wie hier, wo die Sperre direkt angefordert wird:
    synchronized (foo) { // Objekt foo wird exklusiv betreten
      foo.method1(); // ... und somit auch diese Methode.
    }

    // Hier wird die Sperre direkt angefordert:
    synchronized (foo) { // Objekt foo wird exklusiv betreten.
      foo.method2(); // Somit ist auch diese Methode exklusiv
      foo.nummer = 42; // bzw. diese Zuweisung.
    }
  }
}

class Foo {
  public long nummer;

  public synchronized void method1() {
  }

  public void method2() {
  }
}
