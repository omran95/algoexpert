import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return productSum(array, 1);
  }

  public static int productSum(List<Object> array, int depthLvl) {
    int ans = 0;
    for(Object elem: array) {
      if(elem instanceof ArrayList) {
        @SuppressWarnings("unchecked")
        ArrayList<Object> ls = (ArrayList<Object>) elem;
        ans += (depthLvl + 1) * productSum(ls, depthLvl + 1);
      } else {
        ans += (int) elem;
      }
    }
    return ans;
  }
}
