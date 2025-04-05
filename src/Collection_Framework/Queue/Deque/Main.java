package Collection_Framework.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(20);
        deque1.addLast(5);
        deque1.offerFirst(25);
        deque1.offerLast(56);
        System.out.println(deque1);
        System.out.println("first element :" + deque1.getFirst());
        System.out.println("first element :" + deque1.getLast());
        deque1.removeFirst();
        deque1.removeFirst();
        for (int num : deque1){
            System.out.println(num);
        }
    }
}
