package Collection_Framework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU  {
    public    void main(String[] args) {
        LRUCache<String, Integer> studentMap;
        studentMap = new LRUCache<>(3);
        studentMap.put(99, "Bob");
        studentMap.put(89, "Alice");
        studentMap.put(71, "Neha");
        studentMap.put(80, "Vipul");
        System.out.println(studentMap);
    }

    public class  LRUCache < V,K> extends LinkedHashMap<K,V> {
        private int capacity;

        public LRUCache(int capacity){
            super(capacity , 0.75f , true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return super.removeEldestEntry(eldest);
        }
    }
}