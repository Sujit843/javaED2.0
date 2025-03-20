package CoreJava7.Multithreading.Synchronization.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock unfairLock = new ReentrantLock(true);

    public void accessResource(){
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(300);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName() + "released hte lock");
        }
    }

    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread thread1 = new Thread (task, "thread1");
        Thread thread2 = new Thread (task, "thread2");
        Thread thread3 = new Thread (task, "thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    }

