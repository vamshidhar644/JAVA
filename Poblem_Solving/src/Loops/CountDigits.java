package Loops;
import java.util.*;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int count = 0;
		long original_n = n;
		
		while(n>0) {
			n = n/10;
			count++;
		}
		
		System.out.println("Number of digits: "+count);
	}

}
