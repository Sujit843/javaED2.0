package CoreJava7.InnerClasses.Anonymous;

public class CreditCard implements Payment {

    private String creditCardNumber;

    public CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit card .");
    }
}
