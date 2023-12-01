public class MaxValueConverter {
    public static int findMaxNum(int x, int y, int z) {
        if (x == y) {
            return x;
        }

        int maxPossibleValue = Math.max(x, y); 
        int diff = Math.abs(x - y);

        if (z < diff) {
            return -1;
        }

        if ((z - diff) % 2 == 0) {
            return maxPossibleValue;
        } else {
            return maxPossibleValue - 1;
        }
    }

    public static void main(String[] args) {
        // Sample input
        int x = 8;
        int y = 5;
        int z = 3;

        // Call the findMaxNum function
        int result = findMaxNum(x, y, z);

        // Print the result
        System.out.println(result);
    }
}
