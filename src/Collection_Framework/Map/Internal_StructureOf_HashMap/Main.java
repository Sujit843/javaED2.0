package Collection_Framework.Map.Internal_StructureOf_HashMap;

import java.util.HashMap;

public class Main extends HashCodeAndEqual {
    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Charlie", 3);

        map.put(p1,"Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");

        System.out.println("HashMap size: " + map.size());
        System.out.println("Value  for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));



    }
}
