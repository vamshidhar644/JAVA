package linkedlist_;

class Node {
    int data;
    Node next;
}

class Linked {
    private Node getNewNode(int i) {
        Node node = new Node();
        node.data = i;
        node.next = null;

        return node;
    }

    public Node insert(int i, Node node) {
        if (node == null) {
            return getNewNode(i);
        } else {
            node.next = insert(i, node.next);
        }
        return node;
    }

    public void print(Node root) {
        System.out.print("Linked List: ");
        if (root == null) {
            System.out.println("is Empty");
        }
        while (root != null) {
            // Printing the value of each node in a line
            System.out.print("" + root.data + " -> ");
            /* Move to the next node */
            root = root.next;
        }
        System.out.println("NULL");
    }
}

public class LL_Creation {
    public static void main(String[] args) {
        Node root = null;

        Linked list = new Linked();

        root = list.insert(12, root);
        root = list.insert(99, root);
        root = list.insert(37, root);

        list.print(root);
    }
}
