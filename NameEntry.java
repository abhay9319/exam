public class NameEntry {
  public static String nameentry(String s ,String l){
   return s.toLowerCase()+" "+ l.toUpperCase();
  }
  public static void main(String[] args){
    String f = "john";
    String l ="Abraham";
    System.out.println(nameentry(f,l));
  }
}
