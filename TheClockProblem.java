public class TheClockProblem {
  public static void main(String[] args) {
    int X = 4;
    int Y=5;
    int product = X*Y;
    int result = product%12;
    if(result==0){
      result =12;
    }
    else{
     System.out.println(result);
    }
  }
}
