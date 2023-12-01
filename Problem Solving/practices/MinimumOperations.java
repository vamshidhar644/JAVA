import java.util.Scanner;

public class MinimumOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int operations = findMinimumOperations(N);
        System.out.println(operations);
    }

    static int findMinimumOperations(int N) {
        if (N == 1) {
            return 0;
        }

        int[] dp = new int[N + 1];
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = 1 + dp[i - 1];
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i / 2]);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i / 3]);
            }
        }

        return dp[N];
    }
}
