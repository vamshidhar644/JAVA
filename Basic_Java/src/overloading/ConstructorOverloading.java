package overloading;


class Casioo{
	int __m;
	int __n;
	String __operation;
	public Casioo() {
		__m = 0;
		__n = 0;
		__operation = "Nothing";
	}
	public Casioo(int i) {
		__m = i;
		__n = 0;
		__operation = "Nothing";
	}
	public Casioo(int i, int j) {
		__m = i;
		__n = j;
		__operation = "Nothing";
	}
	public Casioo(int i, int j, String op) {
		__m = i;
		__n = j;
		__operation = op;
		
		System.out.println(
				op == "ADD" ? (__m + __n) : 
				op == "SUB" ? (__m - __n) : 
				op == "DIV" ? (__m / __n) : 
				op == "MUL" ? (__m * __n) : "");
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Casioo obj = new Casioo(4, 5, "ADD");

		Casioo objj = new Casioo(4, 5);
	
		
	}
}
