package practices;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        BigInteger n = new BigInteger(num);
        int smallN = Integer.parseInt(num);

        System.out.println(n.isProbablePrime(smallN) ? "prime" : "not prime");
    }
}
