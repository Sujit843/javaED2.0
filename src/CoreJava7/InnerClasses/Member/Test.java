package CoreJava7.InnerClasses.Member;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Tata safari");
        Car.Engine engine =car.new Engine();
        engine.start();
        engine.stop();
        // ham yaha inner class ke method ke help se
        // ham access kar pa rhe  he outer class ke properties ko
        
    }
}
