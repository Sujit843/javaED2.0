package Java8.Function;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = x-> 2*x;
        Function<Integer, Integer> tripleIt = x-> 2*x;
        doubleIt.andThen(tripleIt);
        System.out.println(doubleIt.apply(100));
    }
}
