import java.util.*;

// recursive
class Program {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    return sumDepths(root, 0);
    
  }

  public static int sumDepths(BinaryTree root, int depth) {
    if(root == null) return 0;
    return depth + sumDepths(root.left, depth + 1) + sumDepths(root.right, depth + 1); 
   }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}


// iterative

class Program {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    Stack<BinaryTreeWithDepth> stack = new Stack<>();
    stack.push(new BinaryTreeWithDepth(root, 0));
    int depthSum = 0;
    while(!stack.empty()) {
      BinaryTreeWithDepth tree = stack.pop();
      depthSum += tree.depth;
      int newDpth = tree.depth + 1;
      if(tree.root.left != null) {
        stack.push(new BinaryTreeWithDepth(tree.root.left, newDpth));        
      }
      if(tree.root.right != null) {
        stack.push(new BinaryTreeWithDepth(tree.root.right, newDpth));        
      }
    }
    return depthSum;
  }

  static class BinaryTreeWithDepth {
    BinaryTree root;
    int depth;

    public BinaryTreeWithDepth(BinaryTree root, int depth) {
      this.root = root;
      this.depth = depth;
    }
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
