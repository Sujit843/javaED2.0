package Collection_Framework.Map.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {

        HashMap <Integer , String> map = new HashMap<>();
        map.put(1,"akshit");
        map.put(2,"Neha");
        map.put(3,"sujit");
        map.put(4,"gautam");
        System.out.println(map);

        String student = map.get(31);
        System.out.println(student);
        Set<Integer> keys = map.keySet();
        for ( int i : keys){
            System.out.println(map.get(i));
            map.containsValue(10);

            Set<java.util.Map.Entry<Integer,String>> entries = map.entrySet();

            }
        }

    }


