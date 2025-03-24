package Collection_Framework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list  =  new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(0,45);
        list.size();
        list.remove(1);
        list.remove(Integer.valueOf(3));
        // list.sort();
        System.out.println(list);
        List<Integer> list1  = List.of(1, 3, 6, 7, 6, 5, 4);
         //  list.add(list1);


    }
}
