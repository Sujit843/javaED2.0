package ExceptionsInJava.Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader  = new FileReader("a.txt");
    }
}
