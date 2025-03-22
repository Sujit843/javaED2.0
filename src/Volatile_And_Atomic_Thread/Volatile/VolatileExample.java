package Volatile_And_Atomic_Thread.Volatile;

class SharedObj {
    private volatile boolean flag = false;

    public void setFlagTrue () {
        System.out.println(" write flag is true !");
        flag = true;
    }
    public void printIfTrue () {
        while (! flag){
        }
        System.out.println("Flag is True");
    }
}


public class VolatileExample {
    public static void main(String[] args) {

        SharedObj sharedObj = new SharedObj();
        Thread writerThread = new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(()->{
            sharedObj.printIfTrue();
        });
        writerThread.start();
        readerThread.start();
    }




}
