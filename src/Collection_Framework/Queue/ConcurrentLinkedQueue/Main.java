package Collection_Framework.Queue.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    private static ConcurrentLinkedQueue<String > taskQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) throws InterruptedException {
         Thread Producer = new Thread(() ->{
             for ( int i = 0; i < 1000; i++){
                 System.out.println(i);
             }
         });
         Thread Consumer  = new Thread(()->{
             for (int i = 0; i < 1000; i++){
                 System.out.println(i);
             }
         });
         Producer.start();
         Consumer.start();

         Producer.join();
         Consumer.join();
    }
}
