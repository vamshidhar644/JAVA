package Loops;
import java.util.*;
public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int n = sc.nextInt();
		int sum = 0;
		
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		sc.close();
		System.out.println(sum);
	}

}
