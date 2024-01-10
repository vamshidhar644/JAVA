package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String str) {
        boolean[] ans = new boolean[26];

        int ind = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                ind = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                ind = str.charAt(i) - 'a';
            } else {
                continue;
            }

            ans[ind] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (ans[i] == false) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.nextLine();

        System.out.println(isPangram(str) ? "YES" : "NO");
    }
}
