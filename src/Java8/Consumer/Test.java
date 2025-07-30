package Java8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        Consumer<Integer> print = x-> System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> PrintList = x-> {
            for(int i : x){
                System.out.println(i);
            }
        } ;
            PrintList.accept(list);
    }
}
