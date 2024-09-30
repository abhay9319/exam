public class TossAndScore {
    public static int tossAndScore(String S) {
        int score = 0;
        int countHeads = 0;

        // Loop through each character in the string S (sequence of tosses)
        for (int i = 0; i < S.length(); i++) {
            char toss = S.charAt(i);  // Current toss ('H' or 'T')

            if (toss == 'H') {  // If the toss is heads ('H')
                score += 2;     // Add 2 to the score
                countHeads += 1;  // Increment the consecutive heads counter
            } else {  // If the toss is tails ('T')
                score -= 1;     // Subtract 1 from the score
                countHeads = 0;  // Reset consecutive heads counter
            }

            // If 3 consecutive heads appear, break out of the loop
            if (countHeads == 3) {
                break;
            }
        }

        return score;  // Return the final score
    }

    public static void main(String[] args) {
        String tossSequence = "HTHHTTHHTT";  // Example toss sequence
        System.out.println(tossAndScore(tossSequence));  // Calculate and print score
    }
}
