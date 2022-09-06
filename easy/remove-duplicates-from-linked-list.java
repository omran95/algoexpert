import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
    LinkedList dummyHead = linkedList;
    while(dummyHead != null) {
      LinkedList nextDistinct = dummyHead.next;
      while(nextDistinct != null && nextDistinct.value == dummyHead.value) {
        nextDistinct = nextDistinct.next;
      }
      dummyHead.next = nextDistinct;
      dummyHead = nextDistinct;
    }
    return linkedList;
  }
}
