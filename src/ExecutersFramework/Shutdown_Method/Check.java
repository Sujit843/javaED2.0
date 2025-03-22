package ExecutersFramework.Shutdown_Method;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static CoreJava7.Recursion.Test.factorial;

public class Check {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++){
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();
        System.out.println(" Total Time " + System.currentTimeMillis());
    }
}
