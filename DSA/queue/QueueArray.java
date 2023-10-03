package queue;

import java.util.Scanner;

class ArrayQueue {
    int f = -1, r = -1;
    int n = 10;

    int q[] = new int[n];

    void enqueue(Scanner sc) {
        if (r == n - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.println("Enter data");

        if (f == -1 && r == -1) {
            f = 0;
            r = 0;
        } else {
            r = r + 1;
        }

        q[r] = sc.nextInt();
    }

    void dequeue() {
        if (f == -1 && r == -1) {
            System.out.print("\nEmpty\n");
            return;
        }

        f = f + 1;
    }

    void display() {
        System.out.println("Items are");
        for (int i = f; i <= r; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayQueue queue = new ArrayQueue();

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
