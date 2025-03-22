package ExecutersFramework.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        long startTime = System.currentTimeMillis();
        Thread [] threads = new Thread[9];
        for(int i = 0; i < 10; i++){
            int finalI= i;
            executor.submit(() -> {
                long result = 0;
                try {
                    result = factorial (finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(result);
        });
        }
        executor.shutdown();
        //System.out.println("total time: " + (System.currentTimeMillis() - startTime));
    }
    private static long factorial (int n) throws InterruptedException {
        Thread.sleep(1000);
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
// samjh nhi ayaaa
