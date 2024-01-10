package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class DivisibleBy248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        System.out.println(num % 2 == 0 ? "Yes" : "No");
        System.out.println(num % 4 == 0 ? "Yes" : "No");
        System.out.println(num % 8 == 0 ? "Yes" : "No");
    }
}
