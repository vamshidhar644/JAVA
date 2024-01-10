package Nuts_and_Boults.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Missednumber {
    static int findMissing(int[] arr, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                return arr[i] + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int k = 0; k < n; k++) {
                arr[i] = sc.nextInt();
            }

            int res = findMissing(arr, n);

            System.out.println(res);
        }
    }
}
