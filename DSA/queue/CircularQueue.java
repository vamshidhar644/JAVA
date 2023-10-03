package queue;

import java.util.Scanner;

class QueueCircular {
    int f = -1, r = -1;
    int n = 5;

    int q[] = new int[n];

    void enqueue(Scanner sc) {
        if (f == (r + 1) % n) {
            System.out.println("Queue is full");
            return;
        }

        if (f == -1 && r == -1) {
            f = 0;
            r = 0;
        } else {
            r = (r + 1) % n;
        }
        q[r] = sc.nextInt();
    }

    void dequeue() {
        if (f == -1 && r == -1) {
            System.out.println("Empty Queue!");
        } else if (f == r) {
            f = -1;
            r = -1;
        } else {
            f = (f + 1) % n;
        }
    }

    void display() {
        int i;
        for (i = f; i != r; i = (i + 1) % n) {
            System.out.print(q[i] + " ");
        }
        System.out.println(q[i]);
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, l;

        QueueCircular queue = new QueueCircular();

        do {
            System.out.println("! to enqueue");
            System.out.println("2 to dequeue");
            System.out.println("3 to display");

            d = sc.nextInt();

            switch (d) {
                case 1:
                    queue.enqueue(sc);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
            }

            System.out.println("0 to main menu\nAny key to exit");
            l = sc.nextInt();
        } while (l == 0);
    }
}