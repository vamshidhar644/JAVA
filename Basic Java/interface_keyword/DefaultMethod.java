package interface_keyword;

interface Demo{
	void abc();
	default void show() {
		System.out.println("In Default show()");
	}
}

interface MyDemo{
	default void show() {
		System.out.println("In MyDemo show()");
	}
}

class DemoImp implements Demo, MyDemo{
 	public void abc() {
		System.out.println("In abc()");
	}
	public void show() {
		MyDemo.super.show();
	}
}
public class DefaultMethod {
	public static void main(String[] args) {
		Demo obj = new DemoImp();
		
		obj.show();
		obj.abc();
	}
}
