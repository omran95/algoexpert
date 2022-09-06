import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    int startIndx = 0;
    int lastIndx = str.length() - 1;
    while(startIndx < lastIndx) {
      if(str.charAt(startIndx) != str.charAt(lastIndx)) {
        return false;
      }
      startIndx++;
      lastIndx--;
    }
    return true;
  }
}
