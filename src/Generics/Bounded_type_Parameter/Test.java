package Generics.Bounded_type_Parameter;

public class Test {
        public static void main(String[] args) {
            MyNumber myNumber = new MyNumber(12);
            Box <MyNumber> box = new Box<>(myNumber);
            System.out.println(box);

        }
}
