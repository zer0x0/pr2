package de.hsmannheim.inf.pr2.ads.demo;

import de.hsmannheim.inf.pr2.ads.TreeNode;

/**
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class IntTreeNodeDemo {

  public static void main(String[] args) {
    TreeNode<Integer> t2 = new TreeNode<>(2);
    TreeNode<Integer> t3 = new TreeNode<>(3);
    TreeNode<Integer> t1 = new TreeNode<>(1, t2, t3);
    int value = t1.getLeft().getValue(); // = 2.
    System.out.println("Value = " + value);

    System.out.println("Inorder t1:");
    t1.printInorder();

    // Erzeuge Baum mit Wurzel 4 und linken Teilbaum 2 sowie
    // rechten Teilbaum mit Wurzel 3 und dessen Blättern 5 und 8.
    TreeNode<Integer> t = new TreeNode<>(4,
            new TreeNode<>(2),
            new TreeNode<>(3,
                    new TreeNode<>(5), new TreeNode<>(8)));
    System.out.println("Inorder t:");
    t.printInorder();

    int size = t.size(); // = 5.
  }
}
