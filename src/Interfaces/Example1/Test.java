package Interfaces.Example1;

public class Test {
    public static void main(String[] args){

        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.eat();
        Animal.info();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);
        dog.run();
        cat.run();

    }
}
