public class EvenOdd{
  public static String evenodd(int arr[],int n){
     String ans = "";
     for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        ans = ans+"even";
      }
      else {
        ans = ans+ "odd";
      }
     }
     return ans;
  }
  public static void main(String[] args){
  int arr[] = {1,2,3,4,5};
  int n =5;
  System.out.println(evenodd(arr, n));
}
}