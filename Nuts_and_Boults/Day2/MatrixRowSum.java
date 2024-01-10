package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                count += sc.nextInt();
            }
            System.out.println(count);
        }
    }
}
