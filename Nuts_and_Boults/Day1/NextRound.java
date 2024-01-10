package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = 0, b;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();

            if (a == 0) {
                System.out.println(i);
                return;
            }
        }

        for (int i = m; i < n; i++) {
            b = sc.nextInt();

            if (b != 0) {
                System.out.println(i+1);
                return;
            }
        }

        System.out.println(n);
    }
}
