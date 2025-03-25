package Collection_Framework.List.CopyWriteArray;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {

        List<String> ShoppingList = new CopyOnWriteArrayList<>();
        ShoppingList.add("milk");
        ShoppingList.add("eggs");
        ShoppingList.add("bread");
        System.out.println("initial shopping list : " + ShoppingList);
        for(String  item : ShoppingList){
            System.out.println(item);
            if(item.equals("eggs"));          ShoppingList.add("butter");
            System.out.println("added nutter while reading ");
        }
        System.out.println("update shopping list:" + ShoppingList);

        // copy write array ak new page create karta he modify ke liye
    }
}
