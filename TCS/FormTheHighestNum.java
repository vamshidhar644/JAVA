package TCS;

public class FormTheHighestNum {

    public static boolean canSwap(int m, int n) {

        int n1 = (int) Math.log10(m) + 1;
        int n2 = (int) Math.log10(n) + 1;

        int res1 = m * (int) Math.pow(10, n2) + n;
        int res2 = n * (int) Math.pow(10, n1) + m;

        if (res2 > res1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 30, 56, 33, 9 };

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (canSwap(arr[i], arr[j])) {
                    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
