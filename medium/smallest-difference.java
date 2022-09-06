import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);

    int firstPtr = 0;
    int secondPtr = 0;

    int smallestDiff = Math.abs(arrayOne[firstPtr] - arrayTwo[secondPtr]);
    int smallestPair[] = new int[2];
    smallestPair[0] = arrayOne[firstPtr];
    smallestPair[1] = arrayTwo[secondPtr];
    while(firstPtr <= arrayOne.length - 1 && secondPtr <= arrayTwo.length -1) {
      int currentDifference = Math.abs(arrayOne[firstPtr] - arrayTwo[secondPtr]);
      if(currentDifference < smallestDiff) {
        smallestDiff = currentDifference;
        smallestPair[0] = arrayOne[firstPtr];
        smallestPair[1] = arrayTwo[secondPtr];
      }
      if(currentDifference == 0) {
        return new int[] { arrayOne[firstPtr], arrayTwo[secondPtr]} ;
      }
      if(arrayOne[firstPtr] > arrayTwo[secondPtr]) {
        secondPtr++;
      } else {
        firstPtr++;
      }
    }
    
    return smallestPair;
  }
}
