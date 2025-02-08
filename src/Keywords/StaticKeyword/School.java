package Keywords.StaticKeyword;

public class School {
// Agar mai chahta hu ki is school class ka
    // pure application me sirfh ak hi object create ho

    private static School school = new School();

    private School (){

    }
    public static School getInstance(){
        return school;
    }
}
