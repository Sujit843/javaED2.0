package ExceptionsInJava.Finally;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        System.out.println(divide(1, 0));

    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return -1;
        } finally {
            System.out.println("Bye");
            // agr ham sout ko niche likhte he to nhi chalega error ayega
            // finally ka mtlab he  upar wala chale ya na chale finally jarur chalega
        }
    }
}
