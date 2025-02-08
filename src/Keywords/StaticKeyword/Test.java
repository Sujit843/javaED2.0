package Keywords.StaticKeyword;

public class Test {
    public static void main(String[] args) {

        School school =School.getInstance();



        System.out.println(Utils.max(2,6));
        System.out.println(Utils.min(4,9));
        System.out.println(Utils.trimToUppercase("shyam"));


        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3= new Student();
        Student student4 = new Student();

    //    System.out.println(student.count);
            student.getCount();

         int c =   sum (4,6);
        System.out.println(c);

      /*  Test test = new Test();
        test.sum(x:8, y:9 );
        System.out.println(d);*/
    }
    // use static
    public static int sum(int a, int b){
        return (a +b);

        // Agar ham static ka use kar rahe he to object create karne ki need nhi he
    }
    // without static
  /*  public int sum(int x, int y){
        return (x + y);
    }*/
}
