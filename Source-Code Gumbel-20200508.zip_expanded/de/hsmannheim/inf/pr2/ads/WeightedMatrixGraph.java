package de.hsmannheim.inf.pr2.ads;

/**
 * Ein Graph, der intern eine Adjazenzmatrix benutzt. Die Knoten sind
 * immer durchnummeriert von 0 bis n-1. Hinzufügen oder Löschen
 * von Knoten ist nicht implementiert. Ein Wert in der Matrix
 * verschieden von null bedeutet, dass es zwischen Knoten i und j
 * eine Kante mit entsprechendem Gewicht w_ij gibt.
 * Ungewichtete Graphen haben ein Default-Gewicht von 1.
 * E gibt den Datentyp der Kanten an.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class WeightedMatrixGraph<E> {

  private E[][] matrix;
  private boolean isDirected = true;

  /**
   * Erzeuge einen Graph mit <code>numberNodes</code> Knoten.
   *
   * @param numberNodes
   * @param directed    Wahr, wenn dies ein gerichteter Graph
   *                    sein soll.
   */
  public WeightedMatrixGraph(int numberNodes, boolean directed) {
    matrix = (E[][]) new Object[numberNodes][numberNodes];
    isDirected = directed;
  }

  /**
   * Erzeuge einen Graph mit bereits gefüllter Adjazenz-Matrix.
   * Achtung! Es wird nicht überprüft, ob im Falle eines
   * ungerichteten Graphs die Matrix symmetrisch ist.
   *
   * @param matrix
   * @param directed Wahr, wenn dies ein gerichteter Graph
   *                 sein soll.
   */
  public WeightedMatrixGraph(E[][] matrix, boolean directed) {
    this.matrix = matrix;
    isDirected = directed;
  }


  /**
   * @return Anzahl von Knoten (Vertices).
   */
  public int getNumberOfVertices() {
    return matrix.length;
  }

  /**
   * @param from
   * @param to
   * @return null, falls keine Kante zwischen Knoten from
   * und to besteht, sonst das Gewicht der Kante.
   */
  public E getEdge(int from, int to) {
    return matrix[from][to];
  }

  /**
   * Fügt eine gewichtete Kante zwischen Knoten from und to ein.
   *
   * @param from
   * @param to
   * @param weight
   */
  public void addDirectedEdge(int from, int to, E weight) {
    matrix[from][to] = weight;
  }

  /**
   * Fügt eine gewichtete, aber ungerichtete Kante zwischen
   * Knoten i und j ein.
   *
   * @param i
   * @param j
   * @param weight
   */
  public void addEdge(int i, int j, E weight) {
    matrix[i][j] = weight;
    matrix[j][i] = weight;
  }

  /**
   * Durchlaufe den Graph in Tiefensuche und gib die Knoten aus.
   *
   * @param v Startknoten
   */
  public void printDepthFirst(int v) {
    boolean[] visited = new boolean[getNumberOfVertices()];
    // Das besucht-Feld wird als Parameter übergeben:
    printDepthFirstRec(v, visited);
    System.out.println();
  }

  /**
   * Durchlaufe den Graph in Tiefensuche und gib die Knoten aus.
   *
   * @param v       Aktueller Knoten
   * @param visited Array das angibt, ob ein Knoten bereits besucht wurde.
   */
  public void printDepthFirstRec(int v, boolean[] visited) {
    if (!visited[v]) {
      visited[v] = true;
      // Verarbeite Knoten v:
      System.out.print(v + " ");
      // Für jeden Nachfolger von v...
      for (int j = 0; j < getNumberOfVertices(); j++) {
        if (j != v && getEdge(v, j) != null) {
          printDepthFirstRec(j, visited);
        }
      }
    }
  }


  /**
   * Durchlaufe den Graph in Breitensuche und gib die Knoten aus.
   *
   * @param v Startknoten.
   */
  public void printBreadthFirst(int v) {
    boolean[] visited = new boolean[getNumberOfVertices()];
    // ArrayQueue ist voll ausprogrammiert, ListQueue nicht.
    ArrayQueue<Integer> queue = new ArrayQueue<>();
    queue.enter(v);
    visited[v] = true;

    while (!queue.isEmpty()) {
      int w = queue.leave();
      System.out.print(w + " ");
      for (int wi = 0; wi < getNumberOfVertices(); wi++) {
        if (wi != w && getEdge(w, wi) != null) {
          if (!visited[wi]) {
            queue.enter(wi);
            visited[wi] = true;
          }
        }
      }
    }
    System.out.println();
  }


  /**
   * Durchlaufe den Graph in Tiefensuche und gib die Knoten aus.
   *
   * @param v Startknoten
   */
  public boolean hasCycle(int v) {
    boolean[] visited = new boolean[getNumberOfVertices()];
    // Das besucht-Feld wird als Parameter übergeben:
    return hasCycle(v, visited);
  }

  /**
   * Durchlaufe den Graph in Tiefensuche und gib die Knoten aus.
   *
   * @param v       Aktueller Knoten
   * @param visited Array, das angibt, ob ein Knoten bereits
   *                besucht wurde.
   */
  private boolean hasCycle(int v, boolean[] visited) {
    if (!visited[v]) {
      visited[v] = true;
      // Für jeden Nachfolger von v...
      for (int j = 0; j < getNumberOfVertices(); j++) {
        if (j != v && getEdge(v, j) != null) {
          if (visited[j]) {
            return true;
          } else {
            return hasCycle(j, visited);
          }
        }
      }
    }
    return false;
  }

  /**
   * Dijkstra Algorithmus
   *
   * @param v Von welchem Knoten?
   * @return Liste mit allen kürzesten Distanzen
   */
  public int[] shortestDistanceFrom(int v) {
    // TODO noch nicht implementiert
    return null;
  }
}
