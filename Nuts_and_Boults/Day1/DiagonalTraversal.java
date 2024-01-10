package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            for (int k = 1 - n; k < n; k++) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i - j == k) {
                            sum += matrix[i][j];
                        }
                    }
                }

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}
