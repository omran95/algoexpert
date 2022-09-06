import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
    char[] newLetters = new char[str.length()];
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for(int i = 0; i < str.length(); i++) {
      int currentLetterIndx = alphabet.indexOf(str.charAt(i));
      int newIndex = (currentLetterIndx + key) % 26;
      newLetters[i] = alphabet.charAt(newIndex);
    }
    return new String(newLetters);
  }
}
