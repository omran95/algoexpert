import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int[] largestThree = new int[3];
    for(int i = 0; i < 3; i++) {
      largestThree[i] = array[i];
    }
    Arrays.sort(largestThree);
    for(int i = 3; i < array.length; i++) {
      if(array[i] > largestThree[0]) {
        largestThree[0] = array[i];
        Arrays.sort(largestThree);
      }
    }
    return largestThree;
  }
}