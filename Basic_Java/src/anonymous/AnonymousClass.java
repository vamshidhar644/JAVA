package anonymous;

class A{
	public void show() {
		System.out.println("In A show()");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A() {
			public void show() {
				System.out.println("Anonymous");
			}
		};
		obj.show();
	}

}
