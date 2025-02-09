package CoreJava7.Keywords.StaticKeyword;

public class Student {

    public static int count = 0;
    // Agar ham yaha par static ka use nhi karte he to
    // hame output me sirfh ak object create hua he dikhega

    public Student (){
        count++;
    }

    // static block
    // iska use static var. ke intialization keliye karte he
    static {
        System.out.println("hello");
    }

    private int rollNumber;
    private String name;
    private int age;


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void getCount(){
        System.out.println("Total Students:" + count);
    }
}
