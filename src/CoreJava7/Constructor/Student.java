package CoreJava7.Constructor;

public class Student {
  private  String name ;
  private  int age ;
  private  int rollNumber;

  public Student(String name , int rollNumber , int age){
     this. age = age;
     this. name = name;
      this. rollNumber = rollNumber;

      // ham ak - ak kar ke bhi bana sakte he
  }
  public Student (String name ){
      this.name = name ;
  }
  public Student (int age ){
      this.age = age;
  }


    /*    public Student(){
        age = 10;
    }*/


    // use (Alt+insert) for Get and Set method
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

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
