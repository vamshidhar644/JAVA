package Loops;
import java.util.*;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rev = 0;
		int rem, temp;
		
		temp = num;
		
		while(temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		sc.close();
		System.out.println(num + (num==rev ? " is Palindrome" : " is not palindrome"));
	}

}
