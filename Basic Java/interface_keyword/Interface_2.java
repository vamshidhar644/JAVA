package interface_keyword;

interface Abc{
	void show();
}

class Implimenter implements Abc{
	public void show() {
		System.out.println("Something");
	}
}
public class Interface_2 {
	public static void main(String[] args) {
		Abc obj = new Implimenter();
		
		obj.show();
	}
}
