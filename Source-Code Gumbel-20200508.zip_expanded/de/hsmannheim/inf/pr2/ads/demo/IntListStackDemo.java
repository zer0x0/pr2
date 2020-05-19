package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.ListStack;
import de.hsmannheim.inf.pr2.ads.Stack;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
class IntListStackDemo {

  public static void main(String[] args) {
    Stack<Integer> stack = new ListStack<>();
    stack.push(1); // 1| (<- unten)
    stack.push(2); // 2, 1|
    stack.push(3); // 3, 2, 1|

    while (!stack.isEmpty()) { // Ausgabe: 3, 2, 1
      int i = stack.pop();
      System.out.println(i);
    }
  }
}
