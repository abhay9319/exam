import java.util.Arrays;
public class QualifyingScore {
    public static String greedySolution(int N, int P, int[] S1, int[] S2) {
        int[] differences = new int[N];
        for (int i = 0; i < N; i++) {
            differences[i] = S2[i] - S1[i];
        }

        Arrays.sort(differences);

        int qualifyingScore = 0;
        for (int i = N - 1; i >= N - P; i--) {
            qualifyingScore += differences[i];
        }

        if (qualifyingScore >= 35) {
            return "Qualified " + qualifyingScore;
        } else {
            return "Disqualified " + qualifyingScore;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int P = 3;
        int[] S1 = {5, 10, 15, 20, 25};
        int[] S2 = {15, 30, 20, 30, 25};

        System.out.println(greedySolution(N, P, S1, S2));
    }
}

