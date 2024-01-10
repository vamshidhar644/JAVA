package linkedlist;

public class SingleLinkedList {
	
	Node head;
	private int size;
	
	SingleLinkedList(){
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
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
	
	// add - last
	public void addLast(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode; // added at last
	}
	
	// add - at location
	public void addLoc(String data) {
		Node newNode = new Node(data);
		
		int position = 2;
		
		Node temp = head;
		for(int i=0; i<(position-1);i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
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
	
	// delete - first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		head = head.next;
	}
	
	// delete last
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	
	// delete at position
	public void deleteLoc() {
		int position = 3 ;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node temp = head;
		Node pt = temp.next;
		
		for(int i=0; i<(position-2);i++) {
			temp = pt;
			pt = pt.next;
		}
		
		temp.next = pt.next;
	}
	
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		
		list.addFirst("Dawoor");
		list.addLast("Vamshidhar");
		
		list.addFirst("Mr.");
		
		list.addLast("from");
		
		list.addLast("VIT-AP");
		
		list.addFirst("is");
		list.addFirst("This");
		
		list.printList();
		
		list.deleteFirst();
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList(); 
		
		System.out.println(list.getSize());
		
		list.addLoc("D");
		list.printList();
		
		list.deleteLoc();
		list.printList();
	}
}
