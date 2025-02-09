package CoreJava7.Datatype;

public class testString {
    public static void main(String[] args){

        String a = new String ("Ram");
        String b = new String ("Ram");
        // both are not same
        String c = "Ram";
        String d = "Ram";
        // both are same
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
