public class SpecialFibonacci {
    public static int specialFibonacci(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        int f0 = 1;
        int f1 = 1;
        int fn = 0;
        for (int i = 2; i <= N; i++) {
            fn = (f1*f1 + f0 * f0) % 47;
            f0 = f1;
            f1 = fn;
        }
        
        return fn;
    }
    public static void main(String[] args) {
        int N = 7;
        int result = specialFibonacci(N);
        System.out.println(result);
    }
}

