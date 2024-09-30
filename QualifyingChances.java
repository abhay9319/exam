public class QualifyingChances {public class Main {
  public static void main(String[] args) {
  int N = 5;
  int R = 20;
  int[] arr = {30, 0, 25, 38};
  int runsNeeded = calculateRunsNeeded(N, R, arr);
  System.out.println(runsNeeded);
  }
  public static int calculateRunsNeeded(int N, int R, int[] arr) {
  int currentRuns = 0;
  for (int i = 0; i < arr.length; i++) {
  currentRuns += arr[i];
  }
  int totalRunsRequired = R * N;
  int runsNeeded = totalRunsRequired - currentRuns;
  return runsNeeded;
  }
  }
}
