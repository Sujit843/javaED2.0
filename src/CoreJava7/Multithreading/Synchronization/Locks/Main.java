package CoreJava7.Multithreading.Synchronization.Locks;

public class Main {
    public static void main(String[] args) {

        BankAccount bankaccount = new BankAccount ();
        Runnable task = new Runnable () {
            @Override
            public void run() {
                try {
                    bankaccount.withdraw(50);
                } catch (InterruptedException e) {
                }
            }
        };
        Thread t1 = new Thread (task, "Thread 1");
        Thread t2 = new Thread (task, "Thread 2");
        t1.start();
        t2.start();

        // yaha ham same bank se 2 thread ka use kar ke paisa nikal rhe he
        // dono thread same time par work na kare isiliye synchronized ka use kiya he
        // AB HAME locking ka use karna he
        // kyuki thread 1 more time consume kar rha he or thread 2 long waiting kar rha he
    }
}
