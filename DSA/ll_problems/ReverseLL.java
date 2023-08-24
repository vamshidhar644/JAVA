package ll_problems;

public class ReverseLL {
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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

    public Node reverse(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverse(next, k);
        }

        return prev;
    }

    public static void main(String[] args) {

        ReverseLL rev = new ReverseLL();

        rev.create("A");
        rev.create("B");
        rev.create("C");
        rev.create("D");
        rev.create("E");
        rev.create("F");
        rev.create("G");
        rev.printList();

        rev.head = rev.reverse(rev.head, rev.size);
        rev.printList();
    }
}
