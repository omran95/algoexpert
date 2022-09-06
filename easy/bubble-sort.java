import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    boolean isSorted = false;
    while(!isSorted) {
      isSorted = true;
      int counter = array.length - 1;
      for(int idx = 0; idx < counter; idx++) {
        if(array[idx] > array[idx+1]) {
          int temp = array[idx];
          array[idx] = array[idx+1];
          array[idx+1] = temp;
          isSorted = false;
        }
      }
      counter -= 1;
    }
    return array;
  }
}
