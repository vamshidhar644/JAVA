package collections;

import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(9);
        arr.add(2);

        System.out.println(arr);

        arr.remove(3);

        System.out.println(arr);
    }
}
