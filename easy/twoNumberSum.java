import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    HashSet<Integer> arrayValues = new HashSet<Integer>();
    for(int i : array) {
      int target = targetSum - i;
      if(arrayValues.contains(target)) {
        return new int[]{i, target};
      }
      arrayValues.add(i);
    }
    return new int[]{};
  }
}
