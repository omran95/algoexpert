import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();
    Arrays.sort(array);
    for(int i = 0; i < array.length; i++) {
      int rightPtr = i + 1;
      int leftPtr = array.length - 1;
      while(rightPtr < leftPtr) {
        int currentSum = array[i] + array[rightPtr] + array[leftPtr];
        if(currentSum == targetSum) {
          Integer[] triplet = { array[i], array[rightPtr], array[leftPtr]};
          triplets.add(triplet);
          rightPtr += 1;
          leftPtr -= 1;
        }
        else if(currentSum < targetSum) {
          rightPtr += 1;
        } else {
          leftPtr -= 1;
        }
      }
    }
    return triplets;
  }
}

