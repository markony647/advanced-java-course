package multithreading;

import java.util.Scanner;

public class VolatileTest {

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutDown();
    }
}

class MyThread2 extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}
