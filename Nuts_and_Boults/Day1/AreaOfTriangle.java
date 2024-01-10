package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long b = sc.nextLong();

        long ans = l * b;

        System.out.println(ans);
    }
}
