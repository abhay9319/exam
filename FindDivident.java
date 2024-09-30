public class FindDivident {
 public static int findIndexOfDividend(int[] arr, int divisor, int remainder, int quotient) {
for (int i = 0; i < arr.length; i++) {
      if (arr[i] / divisor == quotient && arr[i] % divisor ==remainder) {
         return i; 
}
}
return -1;
  }
  public static void main(String[] args) {
  int arr[]= {12,4,24,21};
  int divisor = 8;
int remainder = 0;
int quotient = 3;
  System.out.println(findIndexOfDividend(arr, divisor, remainder,quotient));
  }
}
