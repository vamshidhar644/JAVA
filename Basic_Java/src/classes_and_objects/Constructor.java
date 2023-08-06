package classes_and_objects;

class Calcc{
	int __num1;
	int __num2;
	int __result;
	
	public Calcc() { // without parameter
		__num1 = 5;
		__num2 = 5;
		System.out.println("In Constructor");
	}
	
	public Calcc(int n) { // with parameter
		System.out.println(n);
	}
	
	public Calcc(double n) {
		System.out.println((int)n);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Calcc obj = new Calcc(6.5); // constructor is also called
		
//		System.out.println(obj.__num1);
	}
}
