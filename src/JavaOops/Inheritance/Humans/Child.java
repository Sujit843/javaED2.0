package JavaOops.Inheritance.Humans;

public class Child extends Parent{

public Child (int age , String name ){
    super(age , name);
    System.out.println("child constructor called");
}

public void childMethod(){
    super.parentMethod();
    System.out.println("child method called");
    // super() me ham prametrized  constructor call kara sakte he
}
}
