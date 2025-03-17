package ExceptionsInJava.Example;

public class BankAccount {

    private double balance ;

    public BankAccount(double amount){
        this.balance = amount;
    }
    public void withdraw (double amount) throws Exception {
        if(amount > balance ){
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}
