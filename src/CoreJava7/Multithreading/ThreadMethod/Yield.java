package CoreJava7.Multithreading.ThreadMethod;


public class Yield extends Thread {
    public Yield(String name ) {
        super(name);
    }
    @Override
    public void run() {
        for(int  i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Yield  t1 =  new Yield("t1");
        Yield  t2 = new Yield("t2");
        t1.start();
        t2.start();
    }
}

// yield method ka use dusre thread ko chance dene ke liye karte he