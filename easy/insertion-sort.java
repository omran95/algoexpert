import java.util.*;

class Program {
  public static int[] insertionSort(int[] array) {
    for(int i = 1; i < array.length; i++) {
      int currentIndx = i;
      while(currentIndx > 0 && array[currentIndx] < array[currentIndx - 1]) {
        swap(currentIndx, currentIndx - 1, array);
        currentIndx -= 1;
      }
    }
    return array;
  }
  public static void swap(int i, int j, int[] array) {
      int tmp = array[i];
      array[i] = array[j];
      array[j] = tmp;
  }
}

