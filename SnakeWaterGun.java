import java.util.Scanner;

public class SnakeWaterGun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rounds:");
        int n = sc.nextInt();
        System.out.println("Enter the moves:");
        String str = sc.next();
        sc.close();
        
        // Ensure input string length matches rounds
        if (str.length() < n) {
            System.out.println("Invalid input: moves string length is less than the number of rounds.");
            return;
        }

        System.out.println("The number of successful moves by A: " + checkA(str, n));
    }

    public static int checkA(String str, int n) {
        int i = 0;
        int count = 0;

        while (i < n) { // ensure i doesn't exceed string length
            if (str.charAt(i) == 's') {
                if (snakeorwater(str, i)) {
                    count++;
                    i = i + 10;
                } else {
                    if (i + 5 < n && str.charAt(i + 5) == 's') {
                        i = i + 10;
                    } else {
                        i = i + 8;
                    }
                }
            } else if (str.charAt(i) == 'w') {
                if (snakeorwater(str, i)) {
                    count++;
                    i = i + 8;
                } else {
                    i = i + 10;
                }
            } else { // assume the move is 'g' (gun)
                if (gun(str, i)) {
                    count++;
                    i = i + 8;
                } else {
                    if (i + 3 < n && str.charAt(i + 3) == 'w') {
                        i = i + 8;
                    } else {
                        i = i + 6;
                    }
                }
            }

            // Prevent overflow by breaking the loop if 'i' exceeds 'n'
            if (i >= n) {
                break;
            }
        }

        return count;
    }

    public static boolean snakeorwater(String str, int i) {
        if (i + 5 >= str.length()) {
            return false; // prevent index out of bounds
        }

        if (str.charAt(i) == 's') {
            return str.charAt(i + 5) == 'w';
        } else {
            return str.charAt(i + 5) == 'g';
        }
    }

    public static boolean gun(String str, int i) {
        if (i + 3 >= str.length()) {
            return false; // prevent index out of bounds
        }

        return str.charAt(i + 3) == 's';
    }
}
