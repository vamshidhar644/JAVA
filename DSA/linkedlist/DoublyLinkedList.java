package linkedlist;

public class DoublyLinkedList {
	Node head = null;
	Node tail = null;
	
	static class Node{
		Node prev;
		String data;
		Node next;
		
		Node(String data){
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}
	
	// add - first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;	
	}
	
	// add - end
	public void addLast(String data) {
		Node newNode = new Node(data);
		
		if(tail == null) {
			tail = newNode;
			return;
		}
		
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}
	
	// add - location
	public void addLoc(int p, String data) {
		
		Node newNode = new Node(data);
		
		Node temp = head;
		Node ptr = temp.next;
		for(int i=1; i<p-1;i++) {
			temp = ptr;
			ptr = ptr.next;
		}
		
		newNode.prev = temp;
		newNode.next = ptr;
		temp.next = newNode;
		ptr.prev = newNode;
	}
	
	// delete - first
	public void deleteFirst() {
		Node temp = head;
		
		temp = temp.next;
		head = temp;
		head.prev = null;
	}
	
	public void deleteLast() {
		Node temp = tail;
		
		temp = temp.prev;
		tail = temp;
		temp.next = null;
	}
	
	public void deleteLoc(int p) {
		Node temp = head;
		Node ptr = temp.next;
		
		for(int i=1; i<p-1; i++) {
			temp= ptr;
			ptr = ptr.next;
		}
		
		temp.next = ptr.next;
		ptr.next.prev = temp;
		
	}
	
	//print
	public void printList() {

		System.out.print("NULL -> ");
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
	
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		
		dlist.addFirst("23");
		dlist.addFirst("21");
		dlist.addLast("45");
		dlist.addLast("76");
		
		dlist.printList();
		
		dlist.addFirst("32");
		dlist.addLoc(3, "234");
		dlist.printList();
		
		dlist.deleteFirst();
		dlist.printList();
	
		dlist.deleteLast();
		dlist.printList();
		
		dlist.deleteLoc(2);
		dlist.printList();
	}
}
