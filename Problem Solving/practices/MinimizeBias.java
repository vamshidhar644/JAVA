package practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimizeBias {
    public static int minimizeBias(ArrayList<Integer> ratings) {
        Collections.sort(ratings);
        int totalBias = 0;

        for (int i = 0; i < ratings.size(); i += 2) {
            int diff = ratings.get(i + 1) - ratings.get(i);
            totalBias += diff;
        }

        return totalBias;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> ratings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int rating = scanner.nextInt();
            ratings.add(rating);
        }

        if (n % 2 != 0) {
            System.out.println();
        } else {
            int result = minimizeBias(ratings);
            System.out.println(result);
        }

        scanner.close();
    }
}
