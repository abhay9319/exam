public class DecodeString {
  public static String decode(String s){
      int currcount =0;
      StringBuilder ans = new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
          currcount++;
        }
        else {
          if(currcount>0){
            ans.append((char)(currcount+64));
            currcount=0;
          }
        }
      }
      return ans.toString();
  }
  public static void main(String[] args){
    String s = "10110111011110";
    System.out.println(decode(s));
  }
}
