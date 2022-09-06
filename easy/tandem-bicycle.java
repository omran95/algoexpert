import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    Arrays.sort(blueShirtSpeeds);
    Arrays.sort(redShirtSpeeds);
    if(fastest) {
      reveserArray(redShirtSpeeds);
    }
    int speed = 0;
    for(int i = 0; i < blueShirtSpeeds.length; i++) {
      speed += Math.max(blueShirtSpeeds[i], redShirtSpeeds[i]);
    }
    return speed;
  }
  public static void reveserArray(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while(start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }
}
