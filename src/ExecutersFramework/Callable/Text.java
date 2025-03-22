package ExecutersFramework.Callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Text {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable  <Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 2;
        };
        Callable  <Integer> callable2 = () -> 1;
        Callable  <Integer> callable3 = () -> 1;
        List < Callable <Integer>> list = Arrays.asList(callable1,callable3,callable3);
        List < Future<Integer>> futures = executorService.invokeAll(list , 1, TimeUnit.SECONDS);
        executorService.shutdown();


        //  invoke all that means collections of the task
    }
}
