import java.util.*;

class Program {

  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    // Write your code here.
    int [][] sortedIntervals = intervals.clone();
    Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> mergedIntervals = new ArrayList<int[]>();
    int[] currentInterval = sortedIntervals[0];
    mergedIntervals.add(currentInterval);
    for(int[] nextInterval : sortedIntervals) {
      int nextIntervalStart = nextInterval[0];
      int nextIntervalEnd = nextInterval[1];
      int currentIntervalEnd = currentInterval[1];
      if(nextIntervalStart <= currentIntervalEnd) {
        currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
      } else {
        currentInterval = nextInterval;
        mergedIntervals.add(currentInterval);
      }
    }
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }
}
