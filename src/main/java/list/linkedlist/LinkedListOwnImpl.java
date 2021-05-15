package list.linkedlist;

import java.util.Arrays;

public class LinkedListOwnImpl {
    private Node head;
    private int size;

    public void add(int value) {
        // first adding
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index) {
        int currIndex = 0;
        Node tmp = head;
        while (tmp != null) {
            if (currIndex == index) {
                return tmp.getValue();
            } else {
                tmp = tmp.getNext();
                currIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        int currIndex = 0;
        Node tmp = head;
        while (tmp != null) {
            if ((currIndex + 1) == index) {
                tmp.setNext(tmp.getNext().getNext());
                size--;
                return;
            } else {
                tmp = tmp.getNext();
                currIndex++;
            }
        }
    }

    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node tmp = head;
        while (tmp != null) {
            result[idx] = tmp.getValue();
            tmp = tmp.getNext();
            idx++;
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedListOwnImpl linkedListOwn = new LinkedListOwnImpl();
        linkedListOwn.add(2);
        linkedListOwn.add(8);
        linkedListOwn.add(1);
        System.out.println(linkedListOwn);
    }
}
