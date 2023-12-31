package encapsulation;

class Student{
	private int __rollno;
	private String __name;
	
	public int get__rollno() {
		System.out.println("User accessing roll no");
		return __rollno;
		
	}
	public void set__rollno(int __rollno) {
		this.__rollno = __rollno;
		System.out.println("Roll no change");
	}
	public String get__name() {
		return __name;
	}
	public void set__name(String __name) {
		this.__name = __name;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();

		st.set__rollno(2); // assigning value through method	
		int rollno = st.get__rollno();
		System.out.println(rollno);
		
		st.set__name("Vamshi");
		String name = st.get__name();
		System.out.println(name);
	}

}
