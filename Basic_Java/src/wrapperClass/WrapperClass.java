package wrapperClass;


public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 6; // primitive variable
		Integer ii = new Integer(6); // Reference variable - Wrapping
		
		int j = ii.intValue(); // fetch value of integer
		System.out.println(j);

		Integer val = 4; // AutoBoxing
		
		System.out.println(val);
		
		
		String str = "123";
		
		int n = Integer.parseInt(str);
		
		System.out.println(n);
		
	}

}
