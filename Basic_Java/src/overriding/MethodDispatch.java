package overriding;

class Aa{
	public void show() {
		System.out.println("In A ");
	}
}
class Bb extends Aa{
	public void show() {
		System.out.println("In B ");
	}
	public void config() {
		System.out.println("Config");
	}
}
class Cc extends Aa{
	public void show() {
		System.out.println("In C");
	}
	
}
public class MethodDispatch {
	public static void main(String[] args) {
		
		Aa obj = new Bb(); 
		obj.show();

		obj = new Cc();
		obj.show();
	}
}
