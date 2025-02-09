package CoreJava7.AccessModifiers.Protected.Zoo;

public class Animal {

    private String name;

    protected String sound;

    public Animal (String name, String sound){
        this.name= name;
        this.sound= sound;
    // teh ak constructor create kiya he hamne
    }
    public void makSound(){
        System.out.println(name + "make a sound:" + sound);
    }
    protected  void changeSound(String newSound){
        this.sound = newSound;

        // protected class ko wahi access kar skta he
        // jo us class ko exteds kar rha
    }
}
