package Collection_Framework.Set.CopyOnWriteArraySet;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {

        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 0; i <= 5; i++){
            set.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet : " + set);
        System.out.println("Initial concurrentSkipList : " + concurrentSkipListSet);
        System.out.println("\n Iterating concurrentSkipList " + concurrentSkipListSet);

        for ( Integer num: set){
            System.out.println("Reading from CopyOnWriteArraySet" + num);
            set.add(6);
        }

    }
}
