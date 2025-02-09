package CoreJava7.AccessModifiers.Public.School;

public class Student {

    public String name;
    public int age;


    public void sayHello(){
        System.out.println("hello");

    }
    public static void sayBye(){
        System.out.println("Bye..");

        // Agar hamne static ka use kiye he method me to
        // hame object creat karne ki koi need he
    }
}
