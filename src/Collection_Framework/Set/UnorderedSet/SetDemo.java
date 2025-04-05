package Collection_Framework.Set.UnorderedSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        // give unordered output
        // if u want ordered output use LinkedListSet

        Set<Integer> set  = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(67);
        set.add(63);
        System.out.println(set);

        Set<Integer > set1 = new LinkedHashSet<>();
        set1.add(49);
        set1.add(46);
        set1.add(43);
        set1.add(45);
        set1.add(47);
        System.out.println(set1);
    }
}
