package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class BalancedBrackets {
    static boolean isBalanced(String str) {

        int start = 0, end = str.length() - 1;

        int countOpen = 0;

        while (start < end) {
            
            if ((str.charAt(start) == '{' && str.charAt(end) == '}')
                    || (str.charAt(start) == '(' && str.charAt(end) == ')')
                    || (str.charAt(start) == '[' && str.charAt(end) == ']')) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            String s = "";

            s = sc.next();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {

                } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {

                }
            }

            if (!isBalanced(s)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
