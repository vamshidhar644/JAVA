package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
