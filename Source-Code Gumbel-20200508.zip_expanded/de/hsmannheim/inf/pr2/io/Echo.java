package de.hsmannheim.inf.pr2.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 */
public class Echo {
  public static void main(String[] args)
          throws IOException {
    BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
  }
}
