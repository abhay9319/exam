public class PrintingJob {
  public static int printing(int n ,int x){
    int totalprintTime = 0;
    int arrivalTime =0;
    for(int i=1;i<n;i++){
       totalprintTime +=10;
       arrivalTime += x;
    }
    return Math.max(0, totalprintTime-arrivalTime);
  }
  public static void main(String[] args) {
    int N =3;
    int X =10;
    System.out.println(printing(N,X));
  }
}
// OR
// public static int printing(int n ,int x){
//   int timeforpevJobs = (n-1)*10;
//   int lastjobarrivalTime =(n-1)*x;
//   return Math.max(0, timeforpevJobs-lastjobarrivalTime);
// }


