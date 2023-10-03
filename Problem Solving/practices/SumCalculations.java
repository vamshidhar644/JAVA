package practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumCalculations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int MOD = 1000003;

        // Read the number of test cases
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            // Read N
            int N = Integer.parseInt(br.readLine().trim());

            // Read the array of positive numbers A
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            // Calculate the sum
            long sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // Avoid division by zero
                    if (A[j] != 0) {
                        sum += A[i] / A[j];
                        sum %= MOD;
                    }
                }
            }

            // Print the result for this test case
            System.out.println(sum);
        }
    }
}
