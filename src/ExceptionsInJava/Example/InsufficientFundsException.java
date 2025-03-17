package ExceptionsInJava.Example;

// Agar apko koi custom esception banana ho to
// extends karana he exception ko

public class InsufficientFundsException extends Exception  {

    public InsufficientFundsException(){
        super("What do you want ? you don't have money . ");
    }
}
