import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
    List<Integer> sums = new ArrayList<Integer>();
    branchSums(root, sums , 0);
    return sums;
  }
  public static void branchSums(BinaryTree tree, List<Integer> branchSums, int branchCounter) {
    if(tree == null) return;
    if(tree.left == null && tree.right == null) {
      branchSums.add(branchCounter + tree.value);
    }
    branchSums(tree.left, branchSums, branchCounter + tree.value);
    branchSums(tree.right, branchSums, branchCounter + tree.value); 
  }
}
