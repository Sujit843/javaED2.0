package Collection_Framework.List.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(5);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector);
        vector.add(23);
        vector.capacity();
        vector.lastElement();
        System.out.println(vector);


    }
}
