package CoreJava7.Multithreading.Synchronization;

public class Counter {

    private int count = 0;

    // yha use kiya he hamne synchronization ka

    // isko critical section bhi bolte he
    public synchronized void increment (){
        count++;

        // synchronized (this){
        // count++;
        // is traike se ak bar me ak thread access hota he
    }

    public int getCount(){
        return count ;
    }
    }


