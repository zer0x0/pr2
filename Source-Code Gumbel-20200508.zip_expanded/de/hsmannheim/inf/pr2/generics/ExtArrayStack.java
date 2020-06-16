package de.hsmannheim.inf.pr2.generics;

import de.hsmannheim.inf.pr2.ads.ArrayStack;
import java.util.Collection;

/**
 * Eine einfache Erweiterung eines ArrayStack,
 * ausschließlich für didaktische Zwecke.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ExtArrayStack<E> extends ArrayStack<E> {

  public ExtArrayStack(int capacity) {
    super(capacity);
  }


  /**
   * @return Der Stack als String. Unterstes Element ist links.
   */
  public String mkString() {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < size() - 1; i++) {
      sb.append(stack[i] + ", ");
    }
    return "[" + sb.toString() + stack[size() - 1] + "]";
  }

  public void popAll(Collection<? super E> collection) {
    while (!isEmpty()) {
      collection.add(pop());
    }
  }
}
