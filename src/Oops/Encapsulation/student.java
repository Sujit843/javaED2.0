package Oops.Encapsulation;

public class student {
    //class ke under two chij hoti he  properties  and behaviour
    // instance var.

  private  String name ;
  private  int  age ;
   private  int rollNumber;
    // yeh instance variable he
    // sabke liye set and get method banana hoga

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

public void setAge(int x){
    if (x < 0 ) {
        x = 0;
    }
   this.age = 0;
}
public int  getAge (){
    return age ;
}


    /*
    public static void main(String[] args) {
        String name ;   // Local variable he kyuki method ke under he
        
    }*/
}
