package multithreading.syncronizedexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSyncrinized2 {

    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();
    final Object lock1 = new Object();
    final Object lock2 = new Object();
    private List<Integer> list = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToListOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(random.nextInt(100));
        }

    }

    public void addToListTwo() {
        synchronized(lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToListOne();
            addToListTwo();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();

        System.out.println("Program took ms to run:" + (after - before));

        System.out.println("List1: " + list.size());
        System.out.println("List2: " + list2.size());
    }
}
