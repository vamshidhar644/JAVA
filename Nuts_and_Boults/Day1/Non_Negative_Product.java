package Nuts_and_Boults.Day1;

import java.util.*;

public class Non_Negative_Product {
    public static boolean checkZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static int countNegatives(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }

        return count;
    }

    public static int shouldRemoved(int[] arr) {

        if (countNegatives(arr) % 2 == 0 || checkZero(arr)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(shouldRemoved(arr));
        }
    }
}
