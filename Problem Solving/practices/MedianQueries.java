package practices;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MedianQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int Q = Integer.parseInt(br.readLine());
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()) - 1; // Convert to 0-based indexing
            int R = Integer.parseInt(st.nextToken()) - 1; // Convert to 0-based indexing
            int len = R - L + 1;
            int[] subarray = new int[len];

            // Copy the subarray to sort it
            for (int i = 0; i < len; i++) {
                subarray[i] = A[L + i];
            }

            Arrays.sort(subarray);

            // Calculate the median
            int median;
            if (len % 2 == 0) {
                median = (subarray[len / 2 - 1] + subarray[len / 2]) / 2;
            } else {
                median = subarray[len / 2];
            }

            System.out.println(median);
        }
    }
}

