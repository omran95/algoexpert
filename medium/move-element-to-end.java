import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
    int rightPtr = array.size() - 1;
    int startPtr = 0;

    while(startPtr < rightPtr) {
      while(array.get(rightPtr) == toMove && rightPtr > startPtr) {
          rightPtr--;
        }
      if(array.get(startPtr) == toMove) {
        array.set(startPtr, array.get(rightPtr));
        array.set(rightPtr, toMove);
        rightPtr--;
      }
      startPtr++;
    } 
    
    return array;
  }
}
