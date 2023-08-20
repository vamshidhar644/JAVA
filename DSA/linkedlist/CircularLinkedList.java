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

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

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

    // add - end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        newNode.next = head;
    }

    // add at location
    public void addLoc(String data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete - first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        temp = temp.next;
        head = temp;
        tail.next = head;
    }

    // delete - last
    public void deleteLast() {
        if (tail == null || head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        Node ptr = temp.next;

        while (ptr.next != head) {
            temp = ptr;
            ptr = ptr.next;
        }

        temp.next = head;
        tail = temp;
    }

    // delete - location
    public void deleteLoc(int pos) {
        Node temp = head;
        Node ptr = temp.next;

        for (int i = 1; i < pos - 1; i++) {
            temp = ptr;
            ptr = ptr.next;
        }

        temp.next = ptr.next;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst("A");
        cll.addFirst("B");
        cll.addFirst("C");
        cll.addFirst("D");
        cll.addFirst("E");

        cll.traverse();

        cll.addLast("F");
        cll.traverse();

        cll.addLoc("G", 3);
        cll.traverse();

        cll.deleteFirst();
        cll.traverse();

        cll.deleteLast();
        cll.traverse();

        cll.deleteLoc(2);
        cll.traverse();
    }
}
