package CoreJava7.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int a = 1;
        Integer b = 1;
        float f = 1.2f;
        boolean hasGraphicCard = true;
        Boolean isAdult = true;
        Float ff = 1.2f;
        Double d = 1.2;
        Character c= 'c';
        Byte bb = 1;
        Short s = 2;
        Long l =  123l;

        // Bahut aisi jagah he jaha par premitive data type kam nhi karega
        // wha kam ata he wrapper class ( ak hamne niche likha he )
        List<Integer> list = new ArrayList<>();

        Integer x = Integer.valueOf(1);
    // ye Autoboxing he isko aise bhi likh sakte he
        Integer y = 1;
        // autoboxing premitive ko integer me convert karta he

        // Apko kabhi bhi premitive integer ko object me create karna ho to
        // wrapper class ka use karenge

        Integer j = null;  // integer yaha par ak class he isiliye null hold kar rha he
        // int k = null; ye nhi hold karega

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(1,7));
        System.out.println(Integer.max(7,9));
        String str = "123";
        Integer i = Integer.valueOf(str);
        System.out.println(i);

    }
}
