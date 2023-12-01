package Virtusa;

import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swap;

        for (int i = 0; i < n / 2; i++) {
            swap = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = swap;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
