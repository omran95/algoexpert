import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int seqIndex = 0;
    for(int i : array) {
      if(seqIndex == sequence.size()) {
        break;
      }
      if(i == sequence.get(seqIndex)) {
        seqIndex += 1;
      }
    }
    return seqIndex == sequence.size();
  }
}
