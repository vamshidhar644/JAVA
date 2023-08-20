package Loops;
import java.util.*;

public class A_raised_to_power_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		int ans = 1;
		
		for(int i=1; i<=b; i++) {
			ans *= a;
		}
		sc.close();
		System.out.println(a+" raised to power "+b+": "+ans);
	}

}
