package final_keyword;

class A{
	final int DAY; // constant
	public A() {
		DAY = 10;
		
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		
		System.out.println(obj.DAY);
	}

}
