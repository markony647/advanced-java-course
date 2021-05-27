package collections.interable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            System.out.println(iterator.next());
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
