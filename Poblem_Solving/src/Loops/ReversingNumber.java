package Loops;
import java.util.*;
public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int n = sc.nextInt();
		int result = 0;
		
		while(n>0) {
			result = result*10 + n%10;
			n /= 10;
		}
		
		System.out.println(result);
	}

}
