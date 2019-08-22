package task2;


import java.util.*;

public class TwoFifth {

    public static void main(String[] args) {

        System.out.println("\nTwoFifth");

        Map<String, Integer> map = new HashMap<>();
        putToMap("Bb", 1, map);
        putToMap("Aa", 2, map);
        putToMap("Ee", 3, map);
        putToMap("Dd", 4, map);
        putToMap("Cc", 5, map);
        System.out.println("HashMap: " + map);


        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            Integer value = map.get(key);
            putToMap(key, value, linkedMap);
        }
        System.out.println("LinkedHashMap: " + linkedMap);


        //# Repeat the previous example with a HashSet and LinkedHashSet.
        System.out.println("\nRepeating the previous example with a HashSet and LinkedHashSet.");
        Set<String> set = new HashSet<>();
        putToSet("Bb", set);
        putToSet("Aa", set);
        putToSet("Ee", set);
        putToSet("Dd", set);
        putToSet("Cc", set);
        System.out.println("HashSet: " + set);


        Set<String> linkedSet = new LinkedHashSet<>();
        List<String> values = new ArrayList<>(set);
        Collections.sort(values);
        for (String value : values) {
            putToSet(value, linkedSet);
        }
        System.out.println("LinkedHashSet: " + linkedSet);

    }

    private static void putToMap(String key, Integer value, Map<String, Integer> map) {
        System.out.println("Put [" + key + "=" + value + "] to " + map.getClass().getSimpleName());
        map.put(key, value);
    }

    private static void putToSet(String key, Set<String> set) {
        System.out.println("Put [" + key + "] to " + set.getClass().getSimpleName());
        set.add(key);
    }


}
