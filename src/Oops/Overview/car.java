package Overview;

public class car {

      String color;
     String model;
     String brand;                  //All are propertie
     int year;
      int speed;

// methods
    public void acclerate(int increment){
        speed += increment ;
    }
    public void brake (int decrement ){
        speed -= decrement ;
        if (speed < 0){
            speed =0;
        }
    }

}

