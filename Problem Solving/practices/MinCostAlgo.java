package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinCostAlgo {

    public static int minCost(List<ArrayList<Integer>> cost) {
        int n = cost.size();

        int[][] dp = new int[n][3];

        for (int i = 0; i < 3; i++) {
            dp[0][i] = cost.get(0).get(i);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + cost.get(i).get(j));
                    }
                }
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++) {
            minCost = Math.min(minCost, dp[n - 1][j]);
        }

        return minCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<ArrayList<Integer>> cost = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int c = scanner.nextInt();
                row.add(c);
            }
            cost.add(row);
        }

        int result = minCost(cost);
        System.out.println("Minimum cost to build all houses: " + result);

        // Close the scanner
        scanner.close();
    }
}
