package CoreJava7.AccessModifiers.Protected.Test;

import CoreJava7.AccessModifiers.Protected.Zoo.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog( "Bob");
        dog.makSound();
        dog.setDogSound("woof");
        dog.makSound();
        dog.wegTail();
    }
}
