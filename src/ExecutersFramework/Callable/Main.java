package ExecutersFramework.Callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String > callable = () -> "hello";
        Future <String > future = executorService.submit(callable);
        System.out.println(future.get());
        executorService.shutdown();

        // hame jab kuch return karana ho to callable ka use ka karenge
    }
}
