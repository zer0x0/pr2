package de.hsmannheim.inf.pr2.exception;

/**
 * @author Thomas Smits (t.smits@hs-mannheim.de)
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ExceptionArrayDemo {
  public static void main(String[] args) {
      String[] namen = {"Franz", "Hans", "Alfons"};

      for (int i = 0; i < 4; i++) {
        System.out.print(namen[i] + ", ");
      }
  }
}
