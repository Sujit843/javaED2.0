package Collection_Framework.Map.ImmuutableMap;

import Collection_Framework.Map.HashMap.Map;

import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String > map1 = new HashMap<>();
        map1.put(1,"a");
        map1.put(2,"b");
        map1.put(3,"c");
        map1.put(4,"d");
        System.out.println(map1);
        // Map<Integer,String> map2 = Collections.unmodifiableMap(map1);
    }
}
