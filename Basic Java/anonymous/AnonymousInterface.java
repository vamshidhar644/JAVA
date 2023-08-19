package anonymous;


interface Aa{
	void show();
}
public class AnonymousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa obj = new Aa() {
			public void show() {
				System.out.println("Anonymous");
			}
		};
		obj.show();
	}

}
