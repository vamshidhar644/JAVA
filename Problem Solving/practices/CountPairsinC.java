package practices;

import java.util.HashMap;
import java.util.Map;

public class CountPairsinC {
    public static void main(String[] args) {
        int N = 7;
        int[] A = { 3, 3, 3, 2, 3, 2, 2 };
        int X = 2;

        int result = countPairs(N, A, X);
        System.out.println("Number of pairs: " + result);
    }

    public static int countPairs(int N, int[] A, int X) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int current = A[i];

            // Check if the current element is divisible by X
            if (current % X == 0) {
                int required = current / X;

                // Count pairs that meet the criteria
                if (freqMap.containsKey(required)) {
                    count += freqMap.get(required);
                }

                // Update the frequency of the current element
                freqMap.put(current, freqMap.getOrDefault(current, 0) + 1);
            }
        }

        return count;
    }
}
