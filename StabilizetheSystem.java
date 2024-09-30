public class StabilizetheSystem {
        public static String stabilze(int n){
          String s = Integer.toString(n); 
          StringBuilder ans = new StringBuilder();
          for(int i=0;i<s.length();i++){
            char currchar = s.charAt(i);
            if(currchar=='0'){
              ans.append('5');
            }
            else{
              ans.append(currchar);
            }
          }
          return ans.toString();
        }
  public static void main(String[] args) {
    int n = 105204040;
    System.out.println(stabilze(n));
  }
}
