package CoreJava7.Multithreading.LamdaExpression;

public class Example {
    public static void main(String[] args) {

        // ham kisi function ko lambda expression bana sakte he
        // using () -> this symbol

        Runnable runnable = () -> {
            System.out.println("hello");
        };
        Thread t1 = new Thread (runnable);
        t1.start();
    }
}
