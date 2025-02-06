package Constructor;

public class Test {
    public static void main(String[] args) {

        // new Student()  ye ak constructor he
        // constructor ak special method he jiska use
        // object ko intialize karne me

        Student student = new Student("ram", 20, 15);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());

        Student student1 = new Student("Shyam");
    }
}
