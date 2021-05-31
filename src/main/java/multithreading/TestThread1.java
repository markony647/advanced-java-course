package multithreading;

public class TestThread1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread runnerThread = new Thread(new Runner());
        myThread.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from my thread! " + i);
        }
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from my thread! " + i);
        }
    }
}
