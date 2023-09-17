package practices;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int maxLength = 0;
        
        for (int i = 2; i <= n; i += 2) {
            for (int j = 0; j <= n - i; j++) {
                String substring = s.substring(j, j + i);
                int mid = i / 2;
                int leftSum = 0;
                int rightSum = 0;
                
                for (int k = 0; k < mid; k++) {
                    leftSum += Character.getNumericValue(substring.charAt(k));
                    rightSum += Character.getNumericValue(substring.charAt(k + mid));
                }
                
                if (leftSum == rightSum && i > maxLength) {
                    maxLength = i;
                }
            }
        }
        
        System.out.println(maxLength);
    }
}
