package TCS;

import java.util.*;

public class FindNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0, base = 1;

        // while (n > 0) {
        // if (n % 2 == 0) {
        // ans = ans + 4 * base;
        // n = n / 2 - 1;
        // } else {
        // ans = ans + 3 * base;
        // n = n / 2;
        // }

        // base = base * 10;
        // }

        while (n > 0) {
            if (n % 3 == 0) {
                ans = ans + 5 * base;
                n = n / 3 - 1;
            } else if (n % 3 == 2) {
                ans = ans + 3 * base;
                n = n / 3;
            } else {
                ans = ans + 2 * base;
                n = n / 3;
            }

            base = base * 10;
        }

        System.out.println(ans);
    }
}
