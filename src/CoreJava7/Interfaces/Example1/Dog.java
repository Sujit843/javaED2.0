package CoreJava7.Interfaces.Example1;

public class Dog implements Animal {



    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
