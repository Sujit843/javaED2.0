package AccessModifiers.Protected.Zoo;

public class Dog extends Animal{

    // protected class ko wahi access kar skta he
    // jo us class ko exteds kar rha ho

    public Dog(String name){
        super(name , "Bark");
    }

    public void wegTail(){
        System.out.println(getName() + "is wegging its tail:" );
    }
    private  String getName(){
        return getClass().getSimpleName();
    }
    public void setDogSound (String newSound){
    changeSound(newSound);
    }
}
