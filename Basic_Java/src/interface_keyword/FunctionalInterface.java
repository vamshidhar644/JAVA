package interface_keyword;

interface Aa{
	void show();
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa obj = () ->	System.out.println("In Show()");
		
		obj.show();
	}

}
