import java.util.*;

public class DecryptSecretCodes {
    public static int[] determineIndices(int n, int m, int[][] queries) {
        int[] arr = new int[n];
        Arrays.fill(arr, -1); // Initialize arr with -1, indicating values are not determined

        for (int i = 0; i < m; i++) {
            int left = queries[i][0] - 1; // Adjust indices to 0-based
            int right = queries[i][1] - 1;
            int sum = 0;
            for (int j = left; j <= right; j++) {
                if (arr[j] != -1) {
                    sum += arr[j]; // Use known values if available
                }
            }
            for (int j = left; j <= right; j++) {
                if (arr[j] == -1) {
                    arr[j] = sum; // Update the determined values
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                result.add(i + 1); // Adjust indices back to 1-based
            }
        }

        if (result.isEmpty()) {
            return new int[] { -1 };
        } else {
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] queries = { { 1, 3 }, { 1, 2 }, { 4, 4 } };
        int[] result = determineIndices(n, m, queries);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
