package practices;

import java.util.Scanner;

public class CountOddDigitIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (hasOddNumberOfDigits(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Function to check if a number has an odd number of digits
    private static boolean hasOddNumberOfDigits(int number) {
        int digitCount = 0;

        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        return digitCount % 2 != 0;
    }
}
