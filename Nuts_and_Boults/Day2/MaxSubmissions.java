package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class MaxSubmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println((sc.nextInt() * 60)/30);
        }
    }
}
