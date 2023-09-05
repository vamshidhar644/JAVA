package TCS;
public class RightRotateArray {

    public static void rotate(int[] arr, int k) {

        int n = arr.length;

        if (k % n == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }

        while (k > 0) {
            for (int i = n - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            k--;
        }

        while (k > 0) {
            for (int i = 0; i < n - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            k--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8 };

        int k = 20;

        rotate(arr, k);
    }
}
