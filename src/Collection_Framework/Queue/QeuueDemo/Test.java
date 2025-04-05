package Collection_Framework.Queue.QeuueDemo;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);      // enque
        list.add(3);
        list.add(4);
        System.out.println(list);
        // LinkedList act as queue

        Integer  i = list.removeFirst();  // deque
        System.out.println(list);
        list.getFirst();    // peek
        list.poll(); /// output null
        list.remove(); // exeception
    }
}
