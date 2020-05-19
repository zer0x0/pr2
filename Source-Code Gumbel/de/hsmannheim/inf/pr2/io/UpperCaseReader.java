package de.hsmannheim.inf.pr2.io;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class UpperCaseReader extends FilterReader {

  protected UpperCaseReader(Reader in) {
    super(in);
  }

  @Override
  public int read(char[] cbuf, int off, int len)
          throws IOException {
    int result = super.read(cbuf, off, len);

    for (int i = off; i < off + result; i++) {
      cbuf[i] = Character.toUpperCase(cbuf[i]);
    }
    return result;
  }
}
