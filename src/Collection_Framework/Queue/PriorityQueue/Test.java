package Collection_Framework.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(18);
        pq.add(5);
        pq.add(20);
        pq.add(30);
        while (! pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
