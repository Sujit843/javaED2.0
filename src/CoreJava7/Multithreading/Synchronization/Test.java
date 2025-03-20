package CoreJava7.Multithreading.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // ham yaha 2 thread ak hi object ke liye chala  rhe he
        MyThread t1 = new MyThread (counter);
        MyThread t2 = new MyThread (counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        System.out.println(counter.getCount());

        // hamara output 2000 ana chahiye but nhi aa rha he
        // isiliye ham synchronization ka use karege
    }
}
