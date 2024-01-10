package Nuts_and_Boults.Day1;

import java.util.*;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if (word.length() > 10) {
                int l = word.length() - 2;

                System.out.print(word.charAt(0));
                System.out.print(l);
                System.out.print(word.charAt(word.length() - 1));

                System.out.println();
            } else {
                System.out.println(word);
            }

        }
    }
}
