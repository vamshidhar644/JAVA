package linkedlist;

public class CountNodes {
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	// add - first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	//print
		public void printList() {
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			
			Node currNode = head;
			while(currNode != null) {
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			
			System.out.println("NULL");
		}
		
	public void countNodes(){
		int count = 0;
		Node temp = head;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNodes list = new CountNodes();
		
		list.addFirst("23");
		list.addFirst("dns");
		list.addFirst("sdfg");
		list.addFirst("sgg");
		list.addFirst("54");
		
		list.printList();
		
		list.countNodes(); 
	}

}
