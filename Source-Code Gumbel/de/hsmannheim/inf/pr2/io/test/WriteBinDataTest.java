package de.hsmannheim.inf.pr2.io.test;

import static org.junit.Assert.assertArrayEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// import de.hsmannheim.inf.pr2.io.WriteBinData;
import org.junit.Test;

/**
 * Test für die geschriebenen Daten.
 * TODO: Den Sourcecode vollständig einkommentieren,
 * wenn WriteBinData-Klasse implementiert ist.
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class WriteBinDataTest {

  /**
   * Geschriebene Daten testen.
   *
   * @throws IOException Datei-Probleme.
   */
  @Test
  public void testData() throws IOException {

    // WriteBinData.main(new String[0]);

    InputStream is = new FileInputStream("files/bindata2.dat");

    byte[] buffer = new byte[10];
    is.read(buffer);
    assertArrayEquals(new byte[]{
                    (byte) 0xca,
                    (byte) 0xff,
                    (byte) 0xfe,
                    (byte) 0xba,
                    (byte) 0xbe,
                    (byte) 0x00,
                    (byte) 0xde,
                    (byte) 0xad,
                    (byte) 0xbe,
                    (byte) 0xef},
            buffer);

    is.close();
  }
}
