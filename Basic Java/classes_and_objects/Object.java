package classes_and_objects;

class Calc{
	int __num1;
	int __num2;
	int __result;
	
	public int perform(int extra, int prod){ // this is a method
		__result = (__num1 + __num2)*prod;
		
		return __result > 50 ? 1 : 0;
	}
}


public class Object {
	public static void main(String[] args) {
		Calc obj = new Calc(); // Calc() is an object here

		obj.__num1 = 4;
		obj.__num2 = 5;
		
		int k = obj.perform(2, 6);
		
		System.out.println(k);
	}
}
