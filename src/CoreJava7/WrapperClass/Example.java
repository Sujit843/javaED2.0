package CoreJava7.WrapperClass;

public class Example {
    public static void main(String[] args) {

        Student student = new Student();
        student.id = 1;
        fun(student);
        System.out.println(student.id);
    }
// iska btao output kya ayega
    // or output 2 kaise ayega ?
    public static void fun(Student a) {
        Student student = new Student ();
        student.id = 2;
        a = student;

    }
}
class Student {
    public int id;
}
