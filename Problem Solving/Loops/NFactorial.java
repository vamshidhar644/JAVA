package Loops;
import java.util.*;

public class NFactorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
			System.out.println("Factorial number of "+i+" : "+fact);
		}

	}

}
