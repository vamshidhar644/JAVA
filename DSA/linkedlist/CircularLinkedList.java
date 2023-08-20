package linkedlist;

public class CircularLinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while (temp != head) ;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst("A");
        cll.addFirst("B");
        cll.addFirst("C");
        cll.addFirst("D");
        cll.addFirst("E");

        cll.traverse();
    }
}
