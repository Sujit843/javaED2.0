package CoreJava7.Keywords.FinalKeyword.Test;

import CoreJava7.Keywords.FinalKeyword.Vehicles.Car;
import CoreJava7.Keywords.FinalKeyword.Vehicles.Cycle;

public class Test {
    public static void main(String[] args) {

        Car car  = new Car();
        Cycle cycle = new Cycle();
        System.out.println(car.getSpeedLimit());
        System.out.println(cycle.accelerate());
        System.out.println(cycle.getSpeedLimit());
    }
}
