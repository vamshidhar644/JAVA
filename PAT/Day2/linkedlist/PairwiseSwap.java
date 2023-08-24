package PAT.Day2.linkedlist;

public class PairwiseSwap {

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

        while (first != null && first.next != null) {
            Node temp = first.next;
            first.next = second.next;
            second.next = temp;

            first = first.next.next;
            second = second.next.next;
        }
    }

    public static void main(String[] args) {

        PairwiseSwap swap = new PairwiseSwap();

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
