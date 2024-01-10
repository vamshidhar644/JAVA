package Nuts_and_Boults.Day1;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ch = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch.equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
