package final_keyword;

class Aaa{
	public final void show() {
		System.out.println("In A Show()");
	}
}
class Bbb{
	public void show() {
		System.out.println("In B show()");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bbb obj = new Bbb();
		obj.show();
	}

}
