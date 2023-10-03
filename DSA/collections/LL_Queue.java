package collections;

import java.util.*;

public class LL_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(60);
        queue.offer(100);

        System.out.println(queue.peek());

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}
