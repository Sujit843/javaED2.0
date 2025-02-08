package Keywords.FinalKeyword.Vehicles;

public class Cycle extends Vehicle {

    private  final int speedLimit ;

    public int getSpeedLimit() {
        return speedLimit;
    }

    public Cycle() {
        speedLimit= 30;
    }

    @Override
    public boolean accelerate() {

        return false;
    }

    @Override
    public void decelerate() {

    }


}
