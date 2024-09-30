public class HikeTrial {
  public static void main(String[] args) {
    int[] A = {1,2,4,5,6,2,7,1};
    int N = A.length;
    int summitElevation = findSummitElevation(A, N);
    System.out.println(summitElevation);
    }
    public static int findSummitElevation(int[] A, int N) {
    int summit = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
    if (A[i] > summit) {
    summit = A[i];
    } else {
    break;
    }
    }
    return summit;
  }
}
