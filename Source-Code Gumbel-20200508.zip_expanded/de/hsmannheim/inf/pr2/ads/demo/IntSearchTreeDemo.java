package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.SearchTree;

/**
 * Ein Demo für binärere Suchbäume.
 * </p>
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
class IntSearchTreeDemo {

  public static void main(String[] args) {
    SearchTree searchTree = new SearchTree();
    searchTree.add(4);
    searchTree.add(2);
    searchTree.add(6);
    searchTree.add(5);
    searchTree.add(8);
    boolean res = searchTree.contains(8);
    System.out.println(res);

    searchTree.printInorder();
    System.out.println();
  }
}
