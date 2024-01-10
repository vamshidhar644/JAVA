package Strivers;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);

        ans.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer> prev = ans.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add((prev.get(j) + prev.get(j - 1)));
            }
            row.add(1);
            ans.add(row);
        }

        System.err.print(ans);
    }
}
