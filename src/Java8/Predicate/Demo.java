package Java8.Predicate;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {

        Predicate<Integer> isEven  = x-> x%2==0;
        isEven.test(4);
        Predicate<String> isWordStartWithA = x-> x.startsWith("A");
        System.out.println(isEven);
        System.out.println(isWordStartWithA);
    }
}
