package overriding;

class A{
	int i;
	public void show() {
		System.out.println("In A "+ i);
	}
}
class B extends A{
//	@Override
	int i;
	public void show() {
		i=9;
		super.i = 4;
		super.show(); // calls show() in super class
		System.out.println("In B "+ i);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		B obj = new B();
		
		obj.show();
	}

}
