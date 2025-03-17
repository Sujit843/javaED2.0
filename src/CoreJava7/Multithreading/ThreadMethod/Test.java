package CoreJava7.Multithreading.ThreadMethod;

public class Test extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("Hello World..");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setDaemon(true);
        test.start();
        System.out.println("main done ");

    }
}
// daemon thread background thread hote he
// jinka jvm wait nhi karta he