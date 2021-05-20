package sorting.comparator;

import java.util.*;

public class TestSorting {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("frog");
        animals.add("cat");
        animals.add("bird");
        animals.add("dd");
        animals.add("ship");
        animals.add("lion");
        animals.add("a");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(500);
        numbers.add(5);
        numbers.add(23);
        numbers.add(6);
        numbers.add(44);
        numbers.add(90);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                }
                return 0;
            }
        });

        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "John"));
        people.add(new Person(2, "Sam"));
        people.add(new Person(4, "Mike"));
        people.add(new Person(1, "Bob"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(people);
    }

}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
            o1 > o2 => 1
            o1 < o2 => -1
            o1 == o2 => 0
         */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return 0;
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        }
        return 0;
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
