package Collection_Framework.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap <String , Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Banana", 13);

        // output: jaisa write kroge waise hi ayega
        // orange , apple , banana
        System.out.println(linkedHashMap);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Orange", 10);
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 10);

        System.out.println(hashMap);
        //output:  without ordered
    }
}
