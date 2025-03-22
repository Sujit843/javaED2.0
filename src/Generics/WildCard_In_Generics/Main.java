package Generics.WildCard_In_Generics;

import java.util.Arrays;
import java.util.List;

import static java.lang.Double.sum;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(Arrays.asList(1,2,3,4,5)));
    }
    public static double sum (List<? extends Number > numbers){
        double sum = 0;
        for(Number o : numbers){
            sum += o.doubleValue();
        }
        return sum;
    }
}
