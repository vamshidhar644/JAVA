package Virtusa;

import java.util.Scanner;

public class SpecialDish {
    static int Challenge(String str) {
        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                one++;
            } else if (str.charAt(i) == '2') {
                two++;
            } else if (str.charAt(i) == '3') {
                three++;
            }
        }

        if (one <= two && one <= three) {
            return one;
        } else if (two <= one && two <= three) {
            return two;
        } else {
            return three;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(Challenge(str));
    }
}