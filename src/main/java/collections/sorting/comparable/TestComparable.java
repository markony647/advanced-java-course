package collections.sorting.comparable;

import java.util.*;

public class TestComparable {

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person(4, "George"));
        collection.add(new Person(2, "Tom"));
        collection.add(new Person(3, "Cat"));
        collection.add(new Person(1, "Bob"));
    }
}

class Person implements Comparable<Person> {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        }
        return 0;
    }
}
