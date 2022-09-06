import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    int squares[] = new int[array.length];
    int smallerIndx = 0;
    int largestIndx = array.length - 1;
    
    for(int i = array.length - 1; i >= 0; i--) {
      if(Math.abs(array[smallerIndx]) >= Math.abs(array[largestIndx])) {
        squares[i] = array[smallerIndx] * array[smallerIndx];
        smallerIndx++;
      } else {
        squares[i] = array[largestIndx] * array[largestIndx];
        largestIndx--;
      }
    }
    return squares;
  }
}
