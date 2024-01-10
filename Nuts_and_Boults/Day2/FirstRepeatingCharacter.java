package Nuts_and_Boults.Day2;

import java.util.Scanner;

public class FirstRepeatingCharacter {
    static char printFirstRepeat(char[] chAr) {
        for (int i = 0; i < chAr.length - 1; i++) {
            for (int j = i + 1; j < chAr.length; j++) {
                if (chAr[i] == chAr[j]) {
                    return chAr[i];
                }
            }
        }

        return '.';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String S = sc.next();

            char[] chararr = S.toCharArray();

            char res = printFirstRepeat(chararr);

            System.out.println(res);
        }
    }
}
