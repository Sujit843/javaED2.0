package CoreJava7.Interfaces.Example1;

public class Cat implements Animal{




    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
