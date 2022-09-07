import java.util.*;

class Program {
  public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
    // Write your code here.
    inOrder(tree, array);
    return array;
  }

  public static void inOrder(BST tree, List<Integer> array) {
    if(tree == null) {
      return;
    }
    inOrder(tree.left, array);
    array.add(tree.value);
    inOrder(tree.right, array);
  }

  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
    preOrder(tree, array);
    return array;
  }

  public static void preOrder(BST tree, List<Integer> array) {
    if(tree == null) {
      return;
    }
    array.add(tree.value);
    preOrder(tree.left, array);
    preOrder(tree.right, array);
  }

  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
    postOrder(tree, array);
    return array;
  }

  public static void postOrder(BST tree, List<Integer> array) {
    if(tree == null) {
      return;
    }
    postOrder(tree.left, array);
    postOrder(tree.right, array);
    array.add(tree.value);
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
