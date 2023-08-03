package variables;

public class variables_2 {
	public static void main(String args[]) {
		// int , float, double
		
		long l = 50000000000l; // 8bytes => use l at the end
		int int__a = 5; // 4 bytes => 32bits => -2,147,483,648 to 2,147,483,647
		short short__a = 4; // 2bytes => 12bits ==> -32768 to 32767
		byte byte__a = 23; // 1byte => 8bits ==> -128 to 127
		float float__a = 4.3f;
		double double__a = 5.3;
		
		char char__c = 'A'; // ASCII value is 65
		char__c = 66; // ASCII value of B
//		ASCII - American Standard code for information interchange
			
		System.out.println(char__c); // prints B
		
		double double__d = 5; // implicit conversions (or) implicit type casting
		
		int k = (int)5.6; // explicit conversion (or) explicit type casting
		
//		byte -> short/char -> int -> long -> float -> double
		
		System.out.println(k);
		
	}
}
