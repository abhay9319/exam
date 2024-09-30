public class LowerCaseCount {
    public static void main(String[] args) {
    String inputString = "Test String.";
    int lowercaseCount = countLowercaseLetters(inputString);
    System.out.println(lowercaseCount);
    }
    public static int countLowercaseLetters(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
    if (Character.isLowerCase(s.charAt(i))) {
    count++;
    }
    }
    return count;
    }
  }
