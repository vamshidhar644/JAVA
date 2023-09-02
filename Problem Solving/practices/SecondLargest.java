package practices;
class SecondLargest {
    public static int findSecondLarge(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                continue;
            }
            if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 7, 7, 8, 5, 2 };

        System.out.println("Second largest element is " + findSecondLarge(arr));
    }
}