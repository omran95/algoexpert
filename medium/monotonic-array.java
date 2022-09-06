import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
    boolean isNonDecreasing = true;
    boolean isNonIncreasing = true;

    for(int i = 1; i < array.length; i++) {
      if(array[i] > array[i-1]) {
        isNonIncreasing = false;
      }
      if(array[i] < array[i-1]) {
        isNonDecreasing = false;
      }
    }
    return isNonIncreasing || isNonDecreasing;
  }
}
