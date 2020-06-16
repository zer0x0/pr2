package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.UnweightedMatrixGraph;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
class UnweightedMatrixGraphDemo {

  public static void main(String[] args) {
    System.out.println("Graph G wie in Vorlesung:");
    // Beispielgraph wie in Vorlesung gezeigt:
    UnweightedMatrixGraph g = new UnweightedMatrixGraph(7, true);
    g.addDirectedEdge(0, 1);
    g.addDirectedEdge(1, 0);
    g.addDirectedEdge(1, 3);
    g.addDirectedEdge(2, 0);
    g.addDirectedEdge(2, 3);
    g.addDirectedEdge(2, 4);
    g.addDirectedEdge(4, 2);
    g.addDirectedEdge(4, 3);
    g.addDirectedEdge(6, 5);
    g.addDirectedEdge(6, 6);

    System.out.println("g im Tiefendurchlauf ab Knoten 2:");
    g.printDepthFirst(2);

    System.out.println("g im Breitendurchlauf ab Knoten 2:");
    g.printBreadthFirst(2);

    System.out.println("Hat g ab Knoten 2 Zyklen? " + g.hasCycle(2));

    System.out.println("\n");
    // ---
    System.out.println("Ein weiterer Graph:");
    UnweightedMatrixGraph g1 = new UnweightedMatrixGraph(5, true);
    g1.addDirectedEdge(0, 1);
    g1.addDirectedEdge(1, 0);
    g1.addDirectedEdge(0, 3);
    g1.addDirectedEdge(1, 3);
    g1.addDirectedEdge(2, 2);
    g1.addDirectedEdge(3, 4);
    g1.addDirectedEdge(2, 4);
    g1.addDirectedEdge(4, 2);

    System.out.println("g1 im Tiefendurchlauf ab Knoten 0:");
    g1.printDepthFirst(0);
    System.out.println("g1 im Tiefendurchlauf ab Knoten 4:");
    g1.printDepthFirst(4);
    System.out.println("g1 im Breitendurchlauf ab Knoten 4:");
    g1.printBreadthFirst(4);
  }
}
