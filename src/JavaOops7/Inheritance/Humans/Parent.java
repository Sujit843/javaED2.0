package JavaOops7.Inheritance.Humans;

public class Parent extends GrandParent{


public Parent (int age, String name ){
    super(age, name);
    System.out.println("parent constructor called");
}


public void parentMethod(){
    System.out.println( " parent method called");
}
}
