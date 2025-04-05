package Collection_Framework.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<String, Integer> map = new TreeMap<>();

        map.put("Abhi",91);
        map.put("Ani",92);
        map.put("gautam",93);
        map.put("bob",94);

        System.out.println(map);

        map.firstKey();
        map.lastKey();
        map.headMap("ano");
        map.tailMap("bob");
        map.subMap("ani", "bob");
        System.out.println(map);


    }
}
