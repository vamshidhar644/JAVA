package TCS;

import java.util.*;

public class SumOfBinaries {
    public static int exp(int n) {
        int ans = 0;
        int base = 1;

        while (n > 0) {
            int dig = n % 10;
            if (dig != 0) {
                ans = ans + 1 * base;
            }

            base = base * 10;
            n = n / 10;
        } 

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            int ans = exp(n);
            System.out.print(ans + " ");
            n = n - ans;
        }

    }
}
