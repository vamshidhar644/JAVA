package practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTickets {

    public static int maxTickets(List<Integer> tickets) {
        int n = tickets.size();
        if (n == 0)
            return 0;

        Collections.sort(tickets);

        int maxCount = 1;
        int currentCount = 1; 

        for (int i = 1; i < n; i++) {
            if (tickets.get(i).equals(tickets.get(i - 1)) || tickets.get(i) == tickets.get(i - 1) + 1) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        List<Integer> tickets = new ArrayList<>();
        tickets.add(4);
        tickets.add(13);
        tickets.add(2);
        tickets.add(3);
        int result = maxTickets(tickets);
        System.out.println("Maximum possible value of m: " + result);
    }
}
