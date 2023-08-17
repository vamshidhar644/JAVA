package stack;
import java.util.*;

public class Stack_1 {
	public static void main(String[] args) {
		Stack<Integer> num = new Stack<>();
		
		num.push(1);
		num.push(5);
		num.push(9);
		num.push(6);
		num.push(11);
		
		System.out.println(num);

		System.out.println(num.peek());
		
		num.pop();
 
		System.out.println(num);
		
	}
}
