import java.util.*;

class Program {
  public static int longestPeak(int[] array) {
    // Write your code here.
    int longestPeak = 0;
    int i = 1;
    while(i < array.length - 1) {
      boolean isTip = array[i] > array[i-1] && array[i] > array[i+1];
      if(!isTip) {
        i++;
        continue;
      }
      int leftIndx = i-2;
      int rightIndx = i+2;
      while(leftIndx >= 0 && array[leftIndx] < array[leftIndx+1]) {
        leftIndx--;
      }
      while(rightIndx < array.length && array[rightIndx] < array[rightIndx-1]) {
        rightIndx++;
      }
      int currentPeakLength = rightIndx - leftIndx - 1;
      longestPeak = Math.max(longestPeak, currentPeakLength);
      i = rightIndx;
    }
    return longestPeak;
  }
}
