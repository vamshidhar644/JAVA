package classes_and_objects;

class Calccc{
	int __num1;
	int __num2;
	int __result;
	
	public Calccc(int __num1, int __num2) {
		this.__num1 = __num1; // 'this' represents current instance
		this.__num2 = __num2;
	}
	
}

public class ThisKeyword {
	public static void main(String[] args) {
		Calccc obj = new Calccc(4, 5);
		
		System.out.println(obj.__num1);
		System.out.println(obj.__num2);
	}
}
