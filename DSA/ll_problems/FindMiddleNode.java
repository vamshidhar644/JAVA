package ll_problems;
import java.util.*;

class Node{
	public int data;
	public Node next;
}
public class FindMiddleNode {
	
	public void operation(int data, Node[] head) {
		Node newNode = new Node();
		
		newNode.data = data; // put in the data
		newNode.next = head[0]; // Link the old list of new node
		head[0] = newNode; // move the head to point to the new node
	}
	
	public static void main(String[] args) {
		Node[] head = new Node[1];		
		FindMiddleNode temp = new FindMiddleNode();
		
		for(int i=5; i>0; i--) {
			temp.operation(i, head);
		}
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		Node currNode = head[0];
		while(currNode != null) {
			v.add(currNode.data);
			currNode = currNode.next;
		}
		
		int mid = v.get(v.size()/2);
		System.out.println(mid);
	}

}
