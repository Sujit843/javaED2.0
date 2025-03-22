package Generics.Multiple_Generics_Type;

public class Main {
    public static void main(String[] args) {

        Pair <String , Integer> pair = new Pair<>  ("Age", 30);
        System.out.println(pair.getValue());
        System.out.println(pair.getKey());
    }
}
