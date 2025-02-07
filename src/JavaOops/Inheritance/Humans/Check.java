package JavaOops.Inheritance.Humans;

public class Check {
    public static void main(String[] args) {

        Child child = new Child(16, "Sohan");
        System.out.println(child.getAge());
      //  child.setAge(8);
       // child.setName("Ram");

        Parent parent = new Parent (40, "Rohan");
        System.out.println(parent.getAge());

     //    parent.setAge(30);
       // parent.setName("Shyam");
        child.childMethod();
    }
}
