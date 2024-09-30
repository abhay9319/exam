public class ChocolateJar {
    public static int chocolateJar(int[] quantity, int n) {
                                     // n =number of jars
        int cnt = 0;
        for (int i=0;i<n;i++) {
            if (quantity[i] <= 3) {
                cnt += 1;
            } else if (quantity[i] % 3 == 0) {
                cnt += quantity[i] / 3;
            } else {
                cnt += quantity[i] / 3 + 1;
            }
        }
        return cnt;
    }
    // 2 1 5     a =1 b=1 c=1;
// 1 0 4      a=2; b=2; c=2;
// 0 0 3      a= 3 b= 3 c =4;
// 0 0 1      a=4 b 3; c= 4;

    public static void main(String[] args) {
        int[] input1 = {3,2,6};  // example input1
        int input2 = 3;              // example input2 (not used in logic)
        int result = chocolateJar(input1, input2);
        System.out.println("Total chocolates: " + result);
    }
}

