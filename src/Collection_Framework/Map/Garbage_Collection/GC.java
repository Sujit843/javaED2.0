package Collection_Framework.Map.Garbage_Collection;

public class GC {
    public static void main(String[] args) {

        Phone phone = new Phone ("Iphone", "16 pro");
        System.out.println(phone);
     //   phone= null;
        System.out.println(phone);

    }
}
class Phone {
    String brand ;
    String Model;

    public Phone(String brand, String model) {
        this.brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
