package CoreJava7.Multithreading.Synchronization.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private  final Lock lock = new ReentrantLock();

    // synchronized use hua he to jab tak t1 pura process complete nhi kar leta he
    // tab tak t2 wait karega

    public void withdraw (int amount ) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw  " + amount);

        try{
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance >= amount ){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding withdrawal");
                        Thread.sleep(3000);
                        balance -= amount ;
                        System.out.println(Thread.currentThread().getName() + "completed withdrawal. Remaining balance : " + balance );
                    }catch(Exception e){
                        Thread.currentThread().interrupt();
                    }finally{
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + "insufficient balance ");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + "could not acquire the lock , will try again ");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }


    }
}
