import java.util.*;

class Program {
  public static int getNthFib(int n) {
    // Write your code here.
    if( n == 1) {
      return 0;
    }
    int[] ans = new int[n + 1];
    ans[0] = 0;
    ans[1] = 1;
    for(int i = 2; i <= n; i++) {
      ans[i] = ans[i-1] + ans[i-2];
    }
    return ans[n-1];
  }
}