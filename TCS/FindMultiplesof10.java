package TCS;

public class FindMultiplesof10 {
    public static void main(String[] args) {
        int[] arr = { 12, 20, 45, 67, 89, 90, 85 };

        int n = arr.length;

        int l = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 == 0) {
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
            }
        }

        // int k = n - 1;
        // for (int i = n - 1; i > 0; i--) {
        //     if (arr[i] % 10 == 0) {
        //         int temp = arr[i];
        //         arr[i] = arr[k];
        //         arr[k] = temp;
        //         k--;
        //     }
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
