import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
    int maxChange = 0;
    for(int coin : coins) {
      if(coin > maxChange + 1) {
        return maxChange + 1;
      }
      maxChange += coin;
    }
    return maxChange + 1;
  }
}
