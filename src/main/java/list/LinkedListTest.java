package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        System.out.println("===========");
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> listToMeasure) {
        String listType;
        if (listToMeasure instanceof LinkedList) {
            listType = "[LinkedList]";
        } else {
            listType = "[ArrayList]";
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listToMeasure.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(listType + "Adding elements to the end: " + (end - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            listToMeasure.get(i);
        }
        end = System.currentTimeMillis();

        System.out.println(listType + "Getting elements: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listToMeasure.add(0, i);
        }

        end = System.currentTimeMillis();
        System.out.println(listType + "Adding elements to the beginning: " + (end - start));
    }
}
