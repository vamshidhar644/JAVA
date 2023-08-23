package PAT.Day1.Tasks;

public class Matrix {
    public static void main(String[] args) {

        int[][] arr = { { 1, 3, 4, 5 },
                { 7, 5, 4, 7 },
                { 8, 6, 9, 5 },
                { 3, 7, 8, 5 } };

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            } else {
                for (int k = n - 1; k >= 0; k--) {
                    System.out.print(arr[k][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i % 2 == 0 ? arr[0][i] + " " : arr[n - 1][i] + " ");
        }
    }
}
