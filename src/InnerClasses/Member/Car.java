package InnerClasses.Member;

public class Car {

    private String model;

    private boolean isEngineOn;

    // ye hamra ak constructor hogya (niche wala)
    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    // hamne class ke under ak class banaya he
    // yeh bhi ak member he

    class Engine {
        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started.");
            } else {
                System.out.println(model + " engine already on . ");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stopped . ");
            } else {
                System.out.println(model + " engine already off.");
            }
        }
    }


}
