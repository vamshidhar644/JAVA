package ll_problems;

public class MiddleNode {
    Node head;
    // private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            // size++;
        }
    }

    public void create(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode; // added at last
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void findMiddleNode() {
        if (head == null) {
            return;
        }
        Node first = head;
        Node second = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
        }

        System.out.println(second.data);
    }

    public static void main(String[] args) {

        MiddleNode rev = new MiddleNode();

        rev.create("A");
        rev.create("B");
        rev.create("C");
        rev.create("D");
        rev.create("E");
        rev.create("F");
        rev.create("G");
        rev.printList();

        rev.findMiddleNode();

    }
}
