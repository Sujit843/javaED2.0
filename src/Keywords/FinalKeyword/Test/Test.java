package Keywords.FinalKeyword.Test;

import Keywords.FinalKeyword.Vehicles.Car;
import Keywords.FinalKeyword.Vehicles.Cycle;

public class Test {
    public static void main(String[] args) {

        Car car  = new Car();
        Cycle cycle = new Cycle();
        System.out.println(car.getSpeedLimit());
        System.out.println(cycle.accelerate());
        System.out.println(cycle.getSpeedLimit());
    }
}
