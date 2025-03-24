package ExecutersFramework.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class dependentService implements Runnable {
    private final CountDownLatch latch;

    public dependentService(CountDownLatch latch) {
        this.latch= latch;
    }

    public String call() throws Exception  {
        try{
            System.out.println(Thread.currentThread().getName() + "Sercice started.");
            Thread.sleep(2000);
        }finally {
            latch.countDown();
        }
        return "ok";
    }


    @Override
    public void run() {

    }
}

