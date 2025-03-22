package Generics.Bounded_type_Parameter;

import org.w3c.dom.ls.LSOutput;

interface Printable {
    void Print();
}
class MyNumber extends Number implements Printable {
    private final int value ;
    public MyNumber (int value) {
        this.value = value;
    }

    @Override
    public void Print() {

    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

public class Box <T extends Number & Printable > {
    private T item;

    public  Box (T item) {
        this.item = item;
    }
    public void display() {
        item.Print();
    }
    public T getItem() {
        return item;
    }


    // is <T> par ham condition laga sakte he
    // condition me ya to extends karega ya to implement karega


}
