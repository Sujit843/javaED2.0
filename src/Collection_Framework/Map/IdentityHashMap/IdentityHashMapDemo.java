package Collection_Framework.Map.IdentityHashMap;

import Collection_Framework.Map.HashMap.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        String key1 = new String("key1");
        String key2 = new String("key2");

        IdentityHashMap<Object, Object> map = new IdentityHashMap<>();
        map.put(key1 , 1);
        map.put(key2, 2);
        System.out.println(map);
        System.out.println( key1.equals(key2));
        System.out.println(System.identityHashCode(key1));
        System.out.println(key1.hashCode());
    }
}
