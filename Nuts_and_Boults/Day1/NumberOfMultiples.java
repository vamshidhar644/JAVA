package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class NumberOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long count = n / 3 + n / 5 - n / 15;

        System.out.println(count);
    }
}
