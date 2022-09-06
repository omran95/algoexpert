import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Write your code here.
    Collections.sort(redShirtHeights, Collections.reverseOrder());
    Collections.sort(blueShirtHeights, Collections.reverseOrder());

    String shirtColorInFirstRow =  redShirtHeights.get(0) < blueShirtHeights.get(0) ? "BLUE" : "RED";

    for(int i = 0; i < redShirtHeights.size(); i++) {
      if(redShirtHeights.get(i) >= blueShirtHeights.get(i) && shirtColorInFirstRow == "BLUE") {
        return false;
      }
      if(blueShirtHeights.get(i) >= redShirtHeights.get(i) && shirtColorInFirstRow == "RED") {
        return false;
      }
    }
    return true;
  }
}
