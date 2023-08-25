package ll_problems;

public class SortingLL {
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

    public void ascendingSort() {
        Node current = head;
        Node index = null;

        int temp;

        if (head == null) {
            return;
        }

        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data < index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

                index = index.next;
            }

            current = current.next;
        }
    }

    public static void main(String[] args) {

        SortingLL sort = new SortingLL();

        sort.create(23);
        sort.create(53);
        sort.create(27);
        sort.create(12);
        sort.create(24);
        sort.create(75);
        sort.create(74);
        sort.printList();

        sort.ascendingSort();
        sort.printList();
    }
}
