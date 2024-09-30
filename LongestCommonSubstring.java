public class LongestCommonSubstring {
    public static String longestCommonSubstring(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();
    int maxLength = 0;
    int endIndex = 0;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= n; j++) {
    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
    dp[i][j] = dp[i - 1][j - 1] + 1;
    if (dp[i][j] > maxLength) {
    maxLength = dp[i][j];
    endIndex = i;
    }
    }
    }
    }
    return s1.substring(endIndex - maxLength, endIndex);
    }
    public static int calculateAsciiSum(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
    sum += str.charAt(i);
    }
    return sum;
    }
    public static void main(String[] args) {
    String input1 = "mystery";
    String input2 = "legend";
    String lcs = longestCommonSubstring(input1, input2);
    int asciiSum = calculateAsciiSum(lcs);
    System.out.println(asciiSum);
    }
    }