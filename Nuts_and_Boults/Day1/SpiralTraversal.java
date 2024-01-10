package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class SpiralTraversal {
    public static void spiralMatrix(int[][] matrix, int n) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }

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

            spiralMatrix(matrix, n);

            System.out.println();
        }

    }
}
