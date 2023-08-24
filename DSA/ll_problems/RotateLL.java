package ll_problems;

public class RotateLL {
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

    public Node rotateClockwise(int k) {
        if (head == null || head.next == null || k == 0) {
            System.out.println("List is empty");
            return head;
        }

        Node curr = head;
        int len = 1;

        while (curr.next != null) {
            len++;
            curr = curr.next;
        }

        curr.next = head;
        k = k % len;
        k = len - k;

        while (k-- > 0) {
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;
    }

    public void rotateAnitClockwise(int k) {
        if (k == 0) {
            return;
        }

        Node curr = head;

        int count = 1;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            return;
        }

        Node returnNode = curr;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;

        head = returnNode.next;
        returnNode.next = null;
    }

    public static void main(String[] args) {

        RotateLL swap = new RotateLL();

        swap.create("A");
        swap.create("B");
        swap.create("C");
        swap.create("D");
        swap.create("E");
        swap.create("F");
        swap.create("G");
        swap.printList();

        swap.rotateClockwise(2);
        swap.printList();

        swap.rotateAnitClockwise(2);
        swap.printList();
    }
}
