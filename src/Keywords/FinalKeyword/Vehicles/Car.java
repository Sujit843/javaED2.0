package Keywords.FinalKeyword.Vehicles;

public class Car extends Vehicle {

    // yaha car ka speed ko ham fix karna chahte he
    // taki bad me koi change na kr sake
    // isiliye ham final keyword ka use karenge

    private final  int speedLimit = 200 ;

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public boolean accelerate() {

        return false;
    }

    @Override
    public void decelerate() {

    }
}
