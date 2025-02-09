package InnerClasses.Anonymous;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {

        ShoppingCart shoppingcart = new ShoppingCart(150);

        CreditCard creditcard = new CreditCard("4678");
        shoppingcart.processPayment(creditcard);

     // Agar mai chahta hu ki creditcart ka class na banau or
        // mtlb koi bhi implement na ho then

        // ham aise bhi likh sakte he without create alg se class
        // ise hi anonymous innner class bolte  he

        shoppingcart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using Credit card .");
            }
        });
        //anonymous ka use ham
        // one time use ke liye koi object create karna ho tab karte he

        shoppingcart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using paypal .");
            }
        });
    }
}
