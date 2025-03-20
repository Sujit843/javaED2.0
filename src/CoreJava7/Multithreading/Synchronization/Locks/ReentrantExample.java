package CoreJava7.Multithreading.Synchronization.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }
        public void innerMethod() {
            lock.lock();
            try {
                System.out.println(" inner method");
            } finally {
                lock.unlock();
            }
        }
            public static void main ( String[] args){
            ReentrantExample example = new ReentrantExample();
            example.outerMethod();
            }
    }
// reentrant ka matlab outer lock he fir bhi inner method fir se lock kar ke exicute karega
// nhi to yah ak deadlock situation he
