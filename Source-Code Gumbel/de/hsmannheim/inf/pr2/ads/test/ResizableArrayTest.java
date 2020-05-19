package de.hsmannheim.inf.pr2.ads.test;

import de.hsmannheim.inf.pr2.ads.ResizableArray;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Testfälle für das ResizableArray.
 * Bitte schreiben Sie noch weitere Testfälle.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ResizableArrayTest {

  @Test
  public void testIncreaseBackwards() {
    var a = new ResizableArray<Integer>();
    for (var i = 9; i >= 0; i--) {
      a.setAt(i, i);
    }
    assertEquals(10, a.size());
    assertTrue(!a.isEmpty());
    var it = a.iterator();
    assertTrue(it.hasNext());
    for (var i = 0; i < 10; i++) {
      assertEquals(Integer.valueOf(i), it.next());
    }
    assertTrue(!it.hasNext());
  }
}
