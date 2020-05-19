package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.ListNode;

/**
 * Hier wird gezeigt, wie eine funktionale Liste mit Beispieldaten
 * gefüllt wird und einige Operation ausgeführt werden.
 * <p/>
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
class IntListFunctionalDemo {

  public static void main(String[] args) {
    ListNode<Integer> list = null;   // Leere Liste.
    list = new ListNode<Integer>(1); // ergibt 1.
    list = list.addFirst(2);   // ergibt 2, 1.
    list = list.addFirst(3);   // ergibt 3, 2, 1.
    int value = list.getTail().getHead(); // ergibt 2.
    list.addFirst(4);          // ergibt 4, 3, 2, 1.
    int size = list.size();    // ergibt 3.
  }
}
