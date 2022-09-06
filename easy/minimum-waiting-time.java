import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    Arrays.sort(queries);
    int minimumWaitingTime = 0;
    for(int i = 0; i < queries.length; i++) {
      int duration = queries[i];
      minimumWaitingTime += duration * (queries.length - (i + 1));
    }
    return minimumWaitingTime;
  }
}
