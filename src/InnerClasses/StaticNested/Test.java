package InnerClasses.StaticNested;

public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer ("Lambo", "Fronx", "ABC");
       computer.getOs().displayInfo();

       Computer.USB usb = new Computer .USB("TYPE-C");
    }
}
