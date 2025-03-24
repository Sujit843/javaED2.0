package ExecutersFramework.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CF {
    public static void main(String[] args) {

        CompletableFuture<String>completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(1000);
                System.out.println("Worker");
            }catch (Exception e){
            }
            return "ok";
        });
        System.out.println("main"); // first execute
    }
}
