package InnerClasses.StaticNested;

public class Computer {

    public String  model;
    public String brand;

    private OperatingSystem os;

    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }
        public void displayInfo(){
            System.out.println("USB type" + type );
        }
    }

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String model, String brand , String osName) {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName);
    }
    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("computer model:" +model + " os:" + osName);
        }
    }

}
