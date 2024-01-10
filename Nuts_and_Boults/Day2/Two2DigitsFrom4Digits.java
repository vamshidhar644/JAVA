package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class Two2DigitsFrom4Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = Integer.toString(n);

        if (str.charAt(1) == '0') {
            System.out.println(str.charAt(2));
        } else {
            System.out.println(str.charAt(1) + "" + str.charAt(2));
        }
    }
}
