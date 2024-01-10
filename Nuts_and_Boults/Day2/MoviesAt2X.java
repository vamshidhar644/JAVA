package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class MoviesAt2X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = sc.nextInt();

        int k = y / 2;
        int l = x - y;

        System.out.println(k + l);
    }
}
