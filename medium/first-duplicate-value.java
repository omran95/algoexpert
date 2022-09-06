import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    int earliestDuplicatedIndex = Integer.MAX_VALUE;
    for(int i = 0; i < array.length; i++) {
      for(int j = i + 1; j < array.length; j++) {
        if(array[j] == array[i]) {
          earliestDuplicatedIndex = Math.min(earliestDuplicatedIndex, j);
        }
      }
    }
    return earliestDuplicatedIndex == Integer.MAX_VALUE ? -1 : array[earliestDuplicatedIndex];
  }
}



// anotehr solution

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
