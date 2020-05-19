package de.hsmannheim.inf.pr2.generics;

import de.hsmannheim.inf.pr2.ads.ArrayStack;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class StackSum {
  // Stack muss mindestens Elemente vom Typ Number enthalten:
  public double sum(ArrayStack<? extends Number> numbers) {
    double sum = 0;

    while (!numbers.isEmpty()) { // solange Elemente vorhanden...
      Number n = numbers.pop(); // numbers liefert mind. Number.
      sum += n.doubleValue();
    }
    return sum;
  }
}
