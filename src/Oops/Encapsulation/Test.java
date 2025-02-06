package Oops.Encapsulation;

public class Test {
    public static void main(String[] args) {
        student student = new student ();
      //  student.name="Ram";
      //  student.rollNumber = 22;
    // student.age = 15;

     /*    ye hamne set kiya he sab kuch
         encapsulation data hiding hota he
         ye sab ap directly set nhi kar sakte
        System.out.println(student.age ); // get kiya he yha par
         ap set and get kar sakte he only using method (Set and Get ) */

       student.setAge(15);
        System.out.println(student.getAge());
        student.setName("ram");
        System.out.println(student.getName());

     BankAccount bankaccount = new BankAccount();
     bankaccount.setAccountNumber(35789);
        bankaccount.deposit(-15);
        bankaccount.withdraw(10);
        bankaccount.deposit(100);
        bankaccount.withdraw(10);
        System.out.println("Available:"+bankaccount.getBalance());


    }
}
