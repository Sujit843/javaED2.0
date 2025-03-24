package ExecutersFramework.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int numbersOfService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numbersOfService);
        CountDownLatch latch = new CountDownLatch(numbersOfService);
        executorService.submit(new dependentService(latch));
        executorService.submit(new dependentService(latch));
        executorService.submit(new dependentService(latch));
        latch.await();
        System.out.println("main");
        executorService.shutdown();
    }

}
