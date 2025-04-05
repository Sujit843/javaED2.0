package Collection_Framework.Map.Comparable;

import JavaOops7.Encapsulation.student;

public class Main {

    class Student implements Comparable<student> {
    private String name ;
    private double gpa;

    public Student (String name , double gpa ){
        this.name = name;
        this.gpa = gpa;
    }

        @Override
        public int compareTo(student o) {
            return 0;
        }



    }
}
