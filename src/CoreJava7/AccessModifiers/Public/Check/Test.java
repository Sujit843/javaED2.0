package CoreJava7.AccessModifiers.Public.Check;

import CoreJava7.AccessModifiers.Public.School.Student;

public class Test {
    public static void main(String[] args) {

        Student.sayBye();
        // Without object creation call


        Student student = new Student();
        student.age= 15;
        student.name = "ram";
        student.sayHello();
        System.out.println(student.age);
        System.out.println(student.name );



      // Ham ye sab access kar pa rahe he jabki ye dono alg alg packages me he
      // kyuki he public he

    }
}
