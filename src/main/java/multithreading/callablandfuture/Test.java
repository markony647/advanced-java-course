package multithreading.callablandfuture;

import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                Thread.sleep(3000);
                System.out.println("Finished");
                return 5;
            }
        });
        executorService.shutdown();
        try {
            int result = future.get(); // waits for thread termination
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
