package queue;

import java.util.Scanner;

class LinkedListQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node f = null;
    Node r = null;

    public void enqueue(Scanner sc) {
        System.out.print("Enter data ");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        if (f == null) {
            f = new_node;
            r = new_node;
        } else {
            r.next = new_node;
            r = new_node;
        }
    }

    public void dequeue() {
        if (f == null) {
            System.out.println("Underflow");
            return;
        }

        f = f.next;
    }

    public void display() {
        Node temp = f;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(sc);
        queue.enqueue(sc);
        queue.enqueue(sc);
        queue.enqueue(sc);
        queue.enqueue(sc);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}
