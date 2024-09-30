public class CharacterCount {
    public static int charcount(String s, char c){
       int count =0;
       if((c>='a' && c<='z') || (c>='A' && c<='Z')){
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
          count++;
        }
       }
      }
       return count;
    }
    public static void main(String[] args){
    String s = "HelloWorld";
    char c = 'l';
    System.out.println(charcount(s, c));
  }
  
}
