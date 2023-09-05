package TCS;

public class PrimeNumbers {

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 && n != 2) {
            return false;
        }

        if (n % 6 != 5 && n % 6 != 1) {
            return false;
        }

        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        int count = -1;
        int sum = 2;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (isPrime(sum)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
