package PAT.Day2;

public class SwapNodes {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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

    public void swap() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node first = head;
        Node second = head.next;

        if (second == null) {
            return;
        }

        head.next = first.next;
        first.next = head;
        head = first;

        first = head.next.next;
        second = first.next;
        Node third = head.next;

        while (first != null && second != null) {
            first.next = second.next;
            second.next = first;
            third.next = second;
        }

    }

    public static void main(String[] args) {

        SwapNodes swap = new SwapNodes();

        swap.create("A");
        swap.create("B");
        swap.create("C");
        swap.create("D");
        swap.create("E");
        swap.printList();

        swap.swap();
        swap.printList();
    }
}
