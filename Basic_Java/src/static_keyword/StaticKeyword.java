package static_keyword;

class Emp{
	int eid;
	int salary;
	static String ceo;
	
	static {
		ceo = "Larry"; // executes only once
		System.out.println("In static");
	}
	
	public Emp() {  // executes for number of times of objects
		eid = 102;
		salary = 35000;
		System.out.println("In Constructor");
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}
public class StaticKeyword {
	static int i = 0;
	public static void main(String[] args) {
		Emp vamshi = new Emp();
//		vamshi.eid = 101;
//		vamshi.salary = 40000;
		
		i = 9;
		
		System.out.println(i);
		Emp rahul = new Emp();
//		rahul.eid = 109;
//		rahul.salary = 50000;
		
	
		
		vamshi.show();
		rahul.show();
	}
}
