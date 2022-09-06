import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    int startIndex = 0;
    int lastIndex = array.length - 1;
    while(startIndex <= lastIndex) {
      int midIndex = (startIndex + lastIndex) / 2;
      System.out.println(midIndex);
      if(target == array[midIndex]) {
        return midIndex;
      } else if(target > array[midIndex]) {
        startIndex = midIndex + 1;
      } else {
        lastIndex = midIndex - 1;
      }
    }
    return -1;
  }
}
