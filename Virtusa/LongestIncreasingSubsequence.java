package Virtusa;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    static int challenge(int[] arr, int n) {

        // int max = 0;
        if (n == 0)
            return 0;

        int lis[] = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // for (int i = 0; i < n; i++) {
        // lis[i] = 1;
        // }

        // for (int i = 1; i < n; i++) {
        // for (int j = 0; j < i; j++) {
        // if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
        // lis[i] = lis[j] + 1;
        // }
        // }
        // }

        // for (int i : lis) {
        // if (max < i) {
        // max = i;
        // }
        // }

        int res[] = { 1, 4, 3, 6, 3, 8, 5 };

        int max = Arrays.stream(res).max().orElse(-1);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(challenge(arr, n));
    }
}
