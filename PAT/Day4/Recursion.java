package PAT.Day4;

public class Recursion {

    public static int findPaths(int i, int j, int[][] arr) {
        if (i == arr.length - 1 || j == arr.length - 1) {
            return 1;
        }

        return findPaths(i, j + 1, arr) + findPaths(i + 1, j, arr);
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        System.out.println("Number of paths: " + findPaths(0, 0, arr));

    }
}
