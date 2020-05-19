package de.hsmannheim.inf.pr2.generics;

import java.util.ArrayList;
import java.util.List;

import de.hsmannheim.inf.pr2.ads.ArrayStack;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class WildcardDemo {
  public static void main(String[] args) {
    stackPrinter();
    stackSum();
    popAll();
  }

  public static void stackPrinter() {
    ArrayStack<String> stack = new ArrayStack<>(10);
    stack.push("!");
    stack.push("World");
    stack.push("Hello");

    StackPrinter printer = new StackPrinter();
    printer.printStack(stack);

    ArrayStack<?> wildcard1 = new ArrayStack<String>(10);
    // ArrayStack<?> wildcard2 =
    //   new SimpleStack<?>(10); // Compilerfehler!
  }

  public static void stackSum() {
    ArrayStack<Integer> stack = new ArrayStack<>(10);
    stack.push(1);
    stack.push(2);
    stack.push(3);

    StackSum sum = new StackSum();
    System.out.println(sum.sum(stack));
  }

  public static void popAll() {
    ExtArrayStack<Number> stack = new ExtArrayStack<>(10);
    stack.push(Integer.valueOf(42));
    stack.push(4711); // Geht auch wg. Auto-Boxing.
    stack.push(Double.valueOf(3.14));
    stack.push(2.71);

    // Object ist Oberklasse von Number:
    List<Object> list = new ArrayList<>();
    stack.popAll(list);
    System.out.println(list);
  }
}
