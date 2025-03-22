package Generics.Safety_Issue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box <Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);


      /*  ArrayList list = new ArrayList();
        list.add("hello");
        list.add(123);
        String str = (String) list.get(0);
        String integer = (String ) list.get(1);

        // Ham yaha kuch bhi add and get kar rhe he integer , string kuch bhi
        // to yha safety issue he
        // or type casting bhi kar he
        // isiliye ham generics ka use karte he

        ArrayList <String> list2 = new ArrayList<>();
        list.add("hello");   */

        // <string> iska mtlab ab ham sirfh string ko add kar sakte he
        // yhi he generis type



    }
}
