package queue;
import java.util.*;

public class Queue_1 {
	public static void main(String[] args) {
		Queue<String> name = new LinkedList<>();
		
		name.add("Vamshi");
		name.add("dhar");
		name.add("Dawoor");
		
		System.out.println(name);

		System.out.println(name.peek());

		name.remove();
		System.out.println(name);
	}
}
