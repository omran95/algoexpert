import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    // Write your code here.
    int startingRow = 0;
    int endingRow = array.length - 1;
    int startingColumn = 0;
    int endingColumn = array[0].length - 1;

    ArrayList<Integer> ans = new ArrayList<Integer>();
    
    while(startingColumn <= endingColumn && startingRow <= endingRow) {
      for(int i = startingColumn; i <= endingColumn; i++) {
        ans.add(array[startingRow][i]);
      }
      for(int i = startingRow + 1; i <= endingRow; i++) {
        ans.add(array[i][endingColumn]);
      }
      for(int i = endingColumn - 1; i >= startingColumn; i--) {
        if(startingRow == endingRow) break;
        ans.add(array[endingRow][i]);
      }
      for(int i = endingRow - 1; i > startingRow; i--) {
        if(startingColumn == endingColumn) break;
        ans.add(array[i][startingColumn]);
      }
      startingRow++;
      startingColumn++;
      endingRow--;
      endingColumn--;
    }
    
    return ans;
  }
}
