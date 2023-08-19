package hashmap;
import java.util.*;

public class Hashmap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> student = new HashMap<>();
		
		student.put(1, "Vamshi");
		student.put(2, "Rahul");
		
		System.out.println(student);
		
		student.put(2, "Vijay");
		
		System.out.println(student);
	}

}
