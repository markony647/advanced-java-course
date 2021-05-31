package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // order is NOT guaranteed
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // order is guaranteed
        Map<Integer, String> treeMap = new TreeMap<>(); // sorted by key (criteria for collections.sorting should be collections.set)

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(32, "Sam");
        map.put(0, "Mike");
        map.put(78, "John");
        map.put(1500, "Lee");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("======================");
    }
}
