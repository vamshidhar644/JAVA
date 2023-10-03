package collections;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> hashSet = new LinkedHashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(60);
        hashSet.add(70);
        hashSet.add(100);

        System.out.println(hashSet);
    }
}
