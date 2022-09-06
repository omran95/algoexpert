import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
    if(document.length() == 0) {
      return true;
    }
    HashMap<Character,Integer> charsHash = new HashMap<Character,Integer>();
    for(int i = 0; i < characters.length(); i++) {
      char currentChar = characters.charAt(i);
      if(charsHash.containsKey(currentChar)) {
        charsHash.put(currentChar, charsHash.get(currentChar) + 1);
      } else {
        charsHash.put(currentChar, 1);
      }
    }
    for(int i = 0; i < document.length(); i++) {
      char currentChar = document.charAt(i);
      if(!charsHash.containsKey(currentChar)) {
        return false;
      }
      int currentFrequency = charsHash.get(currentChar) - 1;
      if(currentFrequency == 0) {
        charsHash.remove(currentChar);
      } else {
         charsHash.put(currentChar, charsHash.get(currentChar) - 1); 
      }
    }
    return true;
  }
}
