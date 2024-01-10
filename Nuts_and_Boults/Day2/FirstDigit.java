package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        String str = Long.toString(n);

        if (str.charAt(0) == '-') {
            System.out.println(str.charAt(1));
        } else {
            System.out.println(str.charAt(0));
        }
    }
}
