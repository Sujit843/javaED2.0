package CoreJava7.Multithreading.Basics;

public class Test {
    public static void main(String[] args) {
        World world = new World ();
        Thread t1 = new Thread (world);
        t1.start();
        //world.start();

        // Agar ham impplement kar rhe to hame thread ka object create karna hoga
        //world.start();   // ye extends me work karta he

        for (; ;){
            System.out.println("Hello");
        }
    }
}
