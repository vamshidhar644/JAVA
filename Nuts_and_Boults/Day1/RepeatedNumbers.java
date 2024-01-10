package Nuts_and_Boults.Day1;

import java.util.*;

public class RepeatedNumbers {
    public static void printRepeating(long[] arr) {
        if (arr.length < 4) {
            return;
        }

        ArrayList<Long> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    res.add(arr[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int it = sc.nextInt();

        for (int i = 0; i < it; i++) {
            int num = sc.nextInt();
            long[] arr = new long[num];

            for (int j = 0; j < num; j++) {
                arr[j] = sc.nextInt();
            }

            printRepeating(arr);
            System.out.println();
        }
    }
}
