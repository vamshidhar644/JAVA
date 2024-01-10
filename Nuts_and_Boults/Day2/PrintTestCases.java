package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class PrintTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int i = 1;
        while (tc != 0) {
            System.out.println("Case " + i + ": " + tc);
            i++;
            tc = sc.nextInt();
        }
    }
}
