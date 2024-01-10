package Nuts_and_Boults.Day1;

import java.math.BigInteger;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int num = sc.nextInt();

            BigInteger[] fact = new BigInteger[num + 1];
            fact[0] = BigInteger.ONE;

            for (int i = 1; i <= num; i++) {
                fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            }

            System.out.println(fact);
        }
    }
}
