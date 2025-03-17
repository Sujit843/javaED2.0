package CoreJava7.Multithreading.ThreadMethod;

public class SetPriority extends Thread {
    public SetPriority(String name ){
        super (name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + "- priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {
    SetPriority t1 = new SetPriority("Sujit");
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    }


}