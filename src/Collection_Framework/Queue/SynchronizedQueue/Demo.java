package Collection_Framework.Queue.SynchronizedQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Demo {
    public static void main(String[] args) {

        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread Producer = new Thread (() -> {
            try {
                System.out.println("Producer is waiting to transfer ....");
                queue.put("Hello from producer !");
                System.out.println("producer has transferd mes..");
                Thread.currentThread().interrupt();
            } catch (RuntimeException | InterruptedException e) {
            }
        });
        Thread Consumer = new Thread(()-> {
            try{
                System.out.println("recieve");
                String msg = queue.take();
                System.out.println("receicve : "+ msg);
            }catch ( Exception e){
            }
        });
    }
}
