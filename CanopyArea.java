public class CanopyArea {
  
    public static int calculateArea(int a) {
    double area = 3.14 * a * a;
    return (int)(area);
    }
    public static void main(String[] args) {
    int a = 5;
    System.out.println(calculateArea(a));
    }

}
