package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class Decomposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = Integer.toString(n);

        if (str.charAt(0) == '-') {
            for (int i = 1; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }

    }
}
