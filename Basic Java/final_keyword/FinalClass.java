package final_keyword;

final class Aa{
	public void show() {
		System.out.println("In A Show()");
	}
}
class Bb{
	public void show() {
		System.out.println("In B show()");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bb obj = new Bb();
		obj.show();
	}

}
