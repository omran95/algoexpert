import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
    HashMap<Character, Integer> characterFrequencies = new HashMap<Character, Integer>();
    for(int i = 0; i < string.length(); i++) {
      char chr = string.charAt(i);
      characterFrequencies.put(chr, characterFrequencies.getOrDefault(chr, 0) + 1);
    }
    for(int i = 0; i < string.length(); i++) {
      char chr = string.charAt(i);
      if(characterFrequencies.get(chr) == 1) {
        return i;
      }
    }
    return -1;
  }
}
