package Nuts_and_Boults.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagrams(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n != m) {
            return false;
        }
        char[] ch1 = new char[n];
        char[] ch2 = new char[n];

        for (int i = 0; i < n; i++) {
            ch1[i] = s1.charAt(i);
            ch2[i] = s2.charAt(i);
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < n; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(isAnagrams(s1, s2) ? "True" : "False");
        }
    }
}
