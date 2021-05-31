package collections.set;

import java.util.*;

public class TestSet {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        testSet(hashSet);
        testSet(linkedHashSet);
        testSet(treeSet);

        // Operations
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

    }

    public static void testSet(Set<String> set) {
        set.add("Vitaly");
        set.add("John");
        set.add("Sam");
        set.add("Bob");

        for (String name : set) {
            System.out.println(name);
        }
        System.out.println("======================");
    }
}
