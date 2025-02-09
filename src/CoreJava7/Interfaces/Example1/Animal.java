package CoreJava7.Interfaces.Example1;

public interface Animal {

    // hamne yha two method likha he
    public abstract void eat();
    void sleep();

public static final int MAX_AGE = 20;  // yeh already contant he final ka use nhi he
     // int MAX_AGE = 20 ;
    // same likha he ye upar wale ke jaisa

public static void info(){
    System.out.println("This is Animal interface . ");

    // Ham static ka use karke interface me method bana skte he
    // or is method ka use
}
        public default void run(){
        this.eat();
            System.out.println("Animal is running.");
            // default ak concrete mehtod hota he
            // Ham agr default method banate he to usko implement karne ki
            // Need nahi he ham direct call kar sakte he other class me
        }

}
