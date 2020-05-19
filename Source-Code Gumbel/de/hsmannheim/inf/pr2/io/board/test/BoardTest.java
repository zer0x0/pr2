package de.hsmannheim.inf.pr2.io.board.test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import de.hsmannheim.inf.pr2.io.board.Board;
import de.hsmannheim.inf.pr2.io.board.Color;

/**
 * Test.
 *
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class BoardTest {

  /**
   * Test für die Implementierung des Spielbrettes.
   *
   * @throws IOException Datei-Probleme.
   */
  @Test
  public void testDame() throws IOException {
    Board s = new Board();
    s.set("a1", Color.BLACK);
    s.set("b1", Color.WHITE);
    s.set("h1", Color.BLACK);
    s.set("h2", Color.BLACK);
    s.set("a8", Color.BLACK);
    s.set("f8", Color.BLACK);
    s.set("f5", Color.WHITE);
    s.set("e3", Color.WHITE);
    s.set("g2", Color.WHITE);

    String stringRepresentation = s.toString();

    s.writeToFile("files/board/daten.dat");

    s = Board.loadFromFile("files/board/daten.dat");

    assertEquals(stringRepresentation, s.toString());

    s = Board.loadFromFile("files/board/testdata.dat");

    assertEquals(stringRepresentation, s.toString());
  }
}
