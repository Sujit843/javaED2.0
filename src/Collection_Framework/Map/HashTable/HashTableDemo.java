package Collection_Framework.Map.HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        // hashtable give correct output
        // kyuki yeh synchronized hai


        Hashtable<Object, Object> map = new Hashtable<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread2");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final size of hashmap : " + map.size());
    }
}