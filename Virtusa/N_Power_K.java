package Virtusa;

import java.util.Scanner;

public class N_Power_K {
    static int challenge(int n, int k) {

        int res = (int) Math.pow(n, k);
        return res % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int res = challenge(n, k);

        System.out.println(res);
    }
}
