package ExecutersFramework.ScheduledExecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // ye 5 sec ke baad print hoga
        scheduler.schedule(
                ()-> System.out.println(" Task execution after 5  second delay !") , 5 , TimeUnit.SECONDS);
        scheduler.shutdown();
        // ye har 5 sec. me print hoga
        scheduler.scheduleAtFixedRate(()->
                        System.out.println("Task exectuion "),
                      5,
                     5,
                TimeUnit.SECONDS
                );

            scheduler.scheduleWithFixedDelay(()->
                    System.out.println("Task executed after 5 sec"),
                    5,
                    5,
                    TimeUnit.SECONDS
            );





    }
}
