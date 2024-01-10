package Nuts_and_Boults.Day2;

import java.util.*;

public class MissingNumber {

    static ArrayList<Long> printMissings(long[] arr1, long[] arr2) {

        ArrayList<Long> res = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                res.add(arr2[j]);
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        long[] arr1 = new long[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        long[] arr2 = new long[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (n1 > n2) {
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr2[n2 - 1] - arr2[0] > 100) {
            return;
        }

        ArrayList<Long> ans = printMissings(arr1, arr2);

        for (long a : ans) {
            System.out.print(a + " ");
        }

    }
}
