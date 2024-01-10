package Nuts_and_Boults.Day1;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> res = new ArrayList<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                res.add(arr[i]);
            }
        }

        for (int ans : res) {
            System.out.print(ans + " ");
        }

    }
}
