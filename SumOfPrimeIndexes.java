public class SumOfPrimeIndexes {
  public static boolean checkprime(int num){
     if(num<=1){
      return false;
     }
     if(num==2){
      return true;
     }
     for(int i=2;i<num/2;i++){
         if(num%i==0){
          return false;
         }
     }
     return true;
  }
  public static int sumOfPrimeIndexElements(int arr[]){
    int sum =0;
    for(int i=0;i<arr.length;i++){
         if(checkprime(i)){
          sum = sum + arr[i];
         }
    }
    return sum;
  }
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    // int[] arr={-1,-2,-3,-4,-5};
    int result = sumOfPrimeIndexElements(arr);
    System.out.println(result);
    }
}
