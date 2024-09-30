import java.util.Scanner;
public class IslandLife {
    public static int minBoxesToBuy(int N, int E, int D) {
        int totalSweetsNeeded = E * D;
        int totalSundays = D / 7;
        int buyDays = D - totalSundays;
        if (E > N && buyDays == 0) {
            return -1;
        }
        int totalBoxesNeeded = (totalSweetsNeeded + N - 1) / N;
        if (totalBoxesNeeded <= buyDays) {
            return totalBoxesNeeded;
        } 
            return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int N = scanner.nextInt();  // Number of sweets in each box
        int E = scanner.nextInt();  // Number of sweets needed each day
        int D = scanner.nextInt();  // Total number of days
        int output = minBoxesToBuy(N, E, D);
        System.out.println(output);
    }

}
