package AccessModifiers.Protected.Test;

import AccessModifiers.Protected.Zoo.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog( "Bob");
        dog.makSound();
        dog.setDogSound("woof");
        dog.makSound();
        dog.wegTail();
    }
}
