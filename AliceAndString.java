public class AliceAndString {
  public static int aliceString(String s){
  //   String arr [] = s.split(",");
  //   int maxlength=0;
  //   for(String str:arr){
  //     if(str.length()>maxlength){
  //       maxlength = str.length();
  //     }
  //   }
  //   return maxlength;
  // }

  int count=0;
  int maxcount=Integer.MIN_VALUE;
  for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=','){
          count++;
      }
      else{
          count=0;
      }
      maxcount=Math.max(maxcount,count);
  }
  return maxcount;
}
  public static void main(String[] args) {
    String s = "abc,de,fg,h";
    System.out.println(aliceString(s));
  }
}
