package PAT.Day3;

public class DetectLoop {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void create(int data) {
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

    public boolean isLoop() {
        // slow and fast pointer approach
        Node slowPointer = head;
        Node fastPointer = slowPointer.next;// slow will move one step every
        // time,fast will move two steps everytime

        while (slowPointer != null) {
            while (fastPointer != null) {
                if (slowPointer.data == fastPointer.data) {
                    return true;
                } else {
                    fastPointer = fastPointer.next;
                }
            }
            slowPointer = slowPointer.next;
        }

        return false;
    }

    public static void main(String[] args) {

        DetectLoop loop = new DetectLoop();

        loop.create(23);
        loop.create(53);
        loop.create(27);
        loop.create(12);
        loop.create(24);
        loop.create(53);
        loop.create(74);
        loop.printList();

        System.out.println(loop.isLoop());
    }
}
