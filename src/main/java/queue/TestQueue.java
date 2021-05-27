package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        Person person5 = new Person(5);

        Queue<Person> people = new ArrayBlockingQueue<>(3);

        // add(), remove(), element() - will throw exception
        // offer(), poll(), peek() - will return false
        people.add(person3);
        people.offer(person2);
        people.offer(person4);
        people.offer(person1);
        people.offer(person5);

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);
    }
}

class Person {
    int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
