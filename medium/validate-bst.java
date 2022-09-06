import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    // Write your code here.
    return tree.isValidBST(Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
    public boolean isValidBST(int minValue, int maxValue) {
      if(value < minValue || value >= maxValue) {
        return false;
      }
      if(left != null && !(left.isValidBST(minValue, value))) {
        return false;
      }
      if(right != null && !(right.isValidBST(value, maxValue))) {
        return false;
      }
      return true;
    }
  }
}
