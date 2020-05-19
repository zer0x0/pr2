package de.hsmannheim.inf.pr2.ads;

/**
 * Ein ungewichteter Graph, der gerichtet oder ungerichtet sein kann.
 * Dieser wird als Spezialfall eines gewichteten Graphens
 * implementiert, bei dem eine Kante das Gewicht 1 (DEFAULT) bekommt.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class UnweightedMatrixGraph extends WeightedMatrixGraph<Integer> {

  /**
   * Der Default-Wert für eine Kante ist hier 1. Damit kann
   * ein gewichteter Graph wiederverwendet werden.
   */
  private Integer DEFAULT = 1;

  /**
   * Erzeuge einen Graph mit <code>numberNodes</code> Knoten.
   *
   * @param numberNodes
   * @param directed    Wahr, wenn dies ein gerichteter Graph
   *                    sein soll.
   */
  public UnweightedMatrixGraph(int numberNodes, boolean directed) {
    super(numberNodes, directed);
  }

  /**
   * Fügt eine gewichtete Kante zwischen Knoten from und to
   * mit Wert 1 ein.
   *
   * @param from
   * @param to
   */
  public void addDirectedEdge(int from, int to) {
    addDirectedEdge(from, to, DEFAULT);
  }

  /**
   * Fügt eine ungewichtete und ungerichtete Kante zwischen
   * Knoten i und j ein.
   *
   * @param i
   * @param j
   */
  public void addEdge(int i, int j) {
    addEdge(i, j, DEFAULT);
  }
}
