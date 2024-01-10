package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(isPrime(n) ? "Yes" : "No");

        sc.close();
    }
}
