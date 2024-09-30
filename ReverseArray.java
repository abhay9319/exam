import java.util.*;
public class ReverseArray {
  public static void main(String[] args) {
    int sum = 0;
    Integer arr[] = {10, 20, 30, 40, 50, 60};
    List<Integer> List =  Arrays.asList(arr);
    Collections.reverse(List);
    List.toArray(arr);
    for(int i=0;i<arr.length;i++){
      if(i%2==0){
        sum = sum +arr[i];
      }
    }
    System.out.println(sum);
  }
}
