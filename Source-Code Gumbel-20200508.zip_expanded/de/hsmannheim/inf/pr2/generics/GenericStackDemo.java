package de.hsmannheim.inf.pr2.generics;

import de.hsmannheim.inf.pr2.ads.ArrayStack;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class GenericStackDemo {

  public static void main(String[] args) {
    stack1();
    extStack();
    integerStack();
    rawStack();
    readDataDemo();
  }

  public static void stack1() {
    ArrayStack<String> stack = new ArrayStack<>(10);
    stack.push("Hallo");
    stack.push("Welt!");
    // stack.push(42); // Compilerfehler!

    String s1 = stack.pop();
    String s2 = stack.pop();
    System.out.println(s1 + " " + s2);
    // int s3 = stack.pop(); // Compilerfehler!
  }

  public static void extStack() {
    ExtArrayStack<String> stack = new ExtArrayStack<>(10);
    stack.push("Hallo");
    stack.push("Welt!");
    System.out.println(stack.mkString());
  }

  public static void integerStack() {
    IntegerArrayStack stack = new IntegerArrayStack(10);
    stack.push(1);
    stack.push(2);
  }

  public static void rawStack() {
    ArrayStack<String> stringStack = new ArrayStack<>(4);
    ArrayStack<Integer> intStack = new ArrayStack<>(4);
    ArrayStack rawStack = new ArrayStack(4);

    System.out.println(stringStack.getClass());
    System.out.println(intStack.getClass());
    System.out.println(rawStack.getClass());
  }


  public static void readDataDemo() {
    ArrayStack<Integer> as = new ArrayStack<>();
    as.push(1); // Füge ein paar Werte ein.
    as.push(2);
    as.push(3);
    readDataTypeParameter(as); // Rufe statische Methoden auf.
    readDataAnonymousWildcard(as);
    readDataNumber(as);
  }

  public static <E> void readDataTypeParameter(ArrayStack<E> stack) {
    while (!stack.isEmpty()) { // Gibt es noch Werte im Stack?
      E e = stack.pop(); // Lies Element aus.
      System.out.println("Element " + e);
    }
  }

  public static void readDataAnonymousWildcard(ArrayStack<?> stack) {
    while (!stack.isEmpty()) { // Gibt es noch Werte im Stack?
      Object e = stack.pop(); // Lies Element aus.
      System.out.println("Element " + e);
    }
  }

  public static <E extends Number>
  void readDataNumber(ArrayStack<E> stack) {
    double summe = 0; // Summe zunächst 0.
    while (!stack.isEmpty()) { // Gibt es noch Werte im Stack?
      E e = stack.pop(); // Lies Element aus.
      summe = summe + e.doubleValue(); // Bilde Summme.
    }
    System.out.println("Summe: " + summe);
  }
}
