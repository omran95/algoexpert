import java.util.*;

class Program {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
     if(value >= this.value) {
       if(this.right == null) {
         this.right = new BST(value);
       } else {
          this.right.insert(value); 
       }
     } else {
       if(this.left == null) {
         this.left = new BST(value);
       } else {
         this.left.insert(value);
       }
     }
      return this;
    }

    public boolean contains(int value) {
      // Write your code here.
      if(this.value == value) {
        return true;
      } else if(value > this.value) {
        if(this.right == null) {
          return false;
        }
        return this.right.contains(value);
      } else {
        if(this.left == null) {
          return false;
        }
        return this.left.contains(value);
      }
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      remove(value, null);
      return this;
    }
    public void remove(int value, BST parent) {
      if(value < this.value) {
        if(left != null) {
           left.remove(value, this); 
        }
      } else if(value > this.value) {
        if(right != null) {
          right.remove(value, this);
        }
      } else {
        if(left != null && right != null) {
          this.value = right.getMinValue();
          right.remove(this.value, this);
        } else if(parent == null) {
          if(left != null) {
            this.value = left.value;
            right = left.right;
            left = left.left;
          } else if(right  != null) {
            this.value = right.value;
            left = right.left;
            right = right.right;
          }
        } else if(this == parent.left) {
          parent.left = left != null ? left : right;
        } else if(this == parent.right) {
          parent.right = right != null ? right : left;
        }
      }
    }

    public int getMinValue() {
      if(left == null) {
        return this.value;
      }
      return left.getMinValue();
    }
  }
}
