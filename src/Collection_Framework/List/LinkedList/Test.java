package Collection_Framework.List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        linkedList.get(3);
        linkedList.addFirst(67);
        linkedList.addLast(89);
        linkedList.getFirst();
        System.out.println(linkedList);


        LinkedList<String > animals = new LinkedList<>(Arrays.asList("cat","dog","lion","horse"));
        LinkedList<String > animalsToRemove = new LinkedList<>(Arrays.asList("dog","cat"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
