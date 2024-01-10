package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int ind_i = -1, ind_j = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    ind_i = i;
                    ind_j = j;
                }
            }
        }

        int ans1 = Math.abs(ind_i - 2);
        int ans2 = Math.abs(ind_j - 2);

        System.out.println(ans1 + ans2);
    }
}
