package Loops;
import java.util.*;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int count = 0;
		// long original_n = n;
		
		while(n>0) {
			n = n/10;
			count++;
		}
		sc.close();
		System.out.println("Number of digits: "+count);
	}

}
