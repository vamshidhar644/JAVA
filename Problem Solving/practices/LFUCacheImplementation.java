package practices;

import java.util.*;

class LFUCache {
    private int capacity;
    private Map<Integer, Integer> keyToValue;
    private Map<Integer, Integer> keyToFreq;
    private Map<Integer, LinkedHashSet<Integer>> freqToKeys;
    private int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.keyToValue = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeys = new HashMap<>();
        this.minFreq = 0;
    }

    public int get(int key) {
        if (!keyToValue.containsKey(key)) {
            return -1;
        }

        int freq = keyToFreq.get(key);
        keyToFreq.put(key, freq + 1);
        freqToKeys.get(freq).remove(key);

        if (freqToKeys.get(freq).isEmpty()) {
            freqToKeys.remove(freq);
            if (freq == minFreq) {
                minFreq++;
            }
        }

        freqToKeys.computeIfAbsent(freq + 1, k -> new LinkedHashSet<>()).add(key);
        return keyToValue.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) {
            return;
        }

        if (keyToValue.containsKey(key)) {
            keyToValue.put(key, value);
            get(key); // Increase the frequency
        } else {
            if (keyToValue.size() >= capacity) {
                evict();
            }
            keyToValue.put(key, value);
            keyToFreq.put(key, 1);
            freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFreq = 1;
        }
    }

    private void evict() {
        LinkedHashSet<Integer> keys = freqToKeys.get(minFreq);
        int evictKey = keys.iterator().next();
        keys.remove(evictKey);
        keyToValue.remove(evictKey);
        keyToFreq.remove(evictKey);
    }
}

public class LFUCacheImplementation {
    public static int[] implementLFU(int cacheSize, String[] queries) {
        LFUCache lfuCache = new LFUCache(cacheSize);
        List<Integer> results = new ArrayList<>();

        for (String query : queries) {
            String[] parts = query.split(" ");
            if (parts[0].equals("PUT")) {
                int key = Integer.parseInt(parts[1]);
                int value = Integer.parseInt(parts[2]);
                lfuCache.put(key, value);
            } else if (parts[0].equals("GET")) {
                int key = Integer.parseInt(parts[1]);
                int value = lfuCache.get(key);
                results.add(value);
            }
        }

        int[] resultArray = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            resultArray[i] = results.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int cacheSize = 2;
        String[] queries = { "PUT 1 1", "PUT 2 2", "GET 1", "PUT 3 3", "GET 2" };
        int[] result = implementLFU(cacheSize, queries);

        for (int value : result) {
            System.out.println(value);
        }
    }
}
