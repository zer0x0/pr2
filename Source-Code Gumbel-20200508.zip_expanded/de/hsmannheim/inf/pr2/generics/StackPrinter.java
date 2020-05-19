package de.hsmannheim.inf.pr2.generics;

import de.hsmannheim.inf.pr2.ads.ArrayStack;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class StackPrinter {
  // <?> bedeutet: Referenz auf irgendeinen ArrayStack:
  public void printStack(ArrayStack<?> stack) {
    for (int i = stack.size(); i > 0; i--) {
      System.out.printf("%d %s%n", i, stack.pop());
    }
  }
}
