public class ArrayMultiplication {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 2, 3};
    if (array1.length != array2.length) {
    System.out.println("Arrays must be of the same length.");
    return;
    }
    int totalSum = 0;
    for (int i = 0; i < array1.length; i++) {
    int product = array1[i] * array2[i];
    totalSum += product;
    }
    System.out.println(totalSum);
    }
}
