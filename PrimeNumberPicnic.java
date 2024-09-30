public class PrimeNumberPicnic {
  public static boolean isprime(int num){
    if(num==0 || num==1){
      return false;
    }
    for(int i=2;i<=Math.sqrt(num);i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int n =17;
    int sum =0;
    for(int i=2;i<=n;i++){
      if(isprime(i)){
        sum = sum +i;
      }
    }
   System.out.println(sum);
  }
}
