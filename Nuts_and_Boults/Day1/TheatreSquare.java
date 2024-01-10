package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long value = (long) Math.ceil((double) m / a) * (long) Math.ceil((double) n / a);

        System.out.println(value);

        scanner.close();
    }
}
