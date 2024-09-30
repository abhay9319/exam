public class SumXor {
  public static int Sumxor(int arr[]){
    int n = arr.length;
    int evenindexsum =0;
    int oddindexsum =0;
    for(int i=0;i<n;i++){
      if(i%2!=0){
        oddindexsum = oddindexsum + arr[i];
      }
      else{
        evenindexsum = evenindexsum^arr[i];
      }
    }
    return oddindexsum-evenindexsum;
  }
  public static void main(String[] args) {
    int arr[] = {10,5,6,3,7,2};
    System.out.println(Sumxor(arr));
  }
}
