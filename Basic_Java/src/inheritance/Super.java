package inheritance;

class A{
	public A() {
		System.out.println("In A");
	}
	public A(int i) {
		System.out.println("In A int");		
	}
}

class B extends A{
	public B() {
		super(7);
		System.out.println("In B");
	}
	public B(int i) {
		super(i);
		System.out.println("In B int");
	}
}
public class Super {
	public static void main(String[] args) {
//		A obj1 = new A();
		
		B obj2 = new B();
	}
}
