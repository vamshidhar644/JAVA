package PAT.Day4;

public class FindSafePath {
    public static boolean isSafe(int i, int j, int[][] arr, int[][] path) {
        if (i == arr.length - 1 && j == arr.length - 1) {
            path[i][j] = 1;
            return true;
        }

        if (i >= 0 && i < arr[i].length && j >= 0 && j < arr.length && arr[i][j] == 1) {
            path[i][j] = 1;

            if (isSafe(i, j + 1, arr, path)) {
                return true;
            }
            if (isSafe(i + 1, j, arr, path)) {
                return true;
            }

            path[i][j] = 0;
            arr[i][j] = 0;

            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 1, 1 },
                { 0, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 0 },
                { 1, 0, 1, 0, 0 },
                { 0, 1, 1, 1, 1 } };

        int[][] path = new int[5][5];

        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                path[i][j] = grid[i][j];
            }
        }

        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                System.out.print(path[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        if (isSafe(0, 0, grid, path)) {
            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path[i].length; j++) {
                    System.out.print(path[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Solution doesnot exists");
        }

    }
}
