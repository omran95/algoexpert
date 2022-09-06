import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
    StringBuilder encodedString = new StringBuilder();
    int currentCharLength = 1;
    for(int i = 1; i < string.length(); i++) {
      char previousChar = string.charAt(i-1);
      char currentChar = string.charAt(i);

      if((previousChar != currentChar) || currentCharLength == 9) {
        encodedString.append(Integer.toString(currentCharLength));
        encodedString.append(previousChar);
        currentCharLength = 0;
      }
      currentCharLength += 1;
    }
    encodedString.append(Integer.toString(currentCharLength));
    encodedString.append(string.charAt(string.length() - 1));
    
    return encodedString.toString();
  }
}
