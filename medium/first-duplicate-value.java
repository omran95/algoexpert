import java.util.*;


class Program {
  public int firstDuplicateValue(int[] array) {
    HashSet<Integer> numbersSet = new HashSet<Integer>();
    for(int i = 0; i < array.length; i++) {
      if(numbersSet.contains(array[i])) {
        return array[i];
      }
      numbersSet.add(array[i]);
    }
    return -1;
  }
}
