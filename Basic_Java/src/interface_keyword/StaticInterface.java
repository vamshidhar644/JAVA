package interface_keyword;

interface Demo0{
	int __num = 8;
	void abc();
	default void show() {
		System.out.println("In Demo show()");
	}
}

class DemoImpl implements Demo0{
	public void abc() {

	}
}


public class StaticInterface {
	public static void main(String[] args) {
//		Demo0.show();
	}
}
