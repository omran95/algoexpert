import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    for(int i = 0; i < array.length; i++) {
      int smallestIndx = getSmallestIndx(array, i);
      swap(i, smallestIndx, array);
    }
    return array;
  }

  public static void swap(int i, int j, int[] array) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static int getSmallestIndx(int[] array, int startingIndx) {
    int smallestIndx = startingIndx;
    for(int i = startingIndx; startingIndx < array.length; startingIndx++) {
      if(array[startingIndx] < array[smallestIndx]) {
        smallestIndx = startingIndx;
      }
    }
    return smallestIndx;
  }
}
