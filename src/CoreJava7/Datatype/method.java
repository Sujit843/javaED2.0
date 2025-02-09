package CoreJava7.Datatype;

public class method {
    public static void main(String[] args){

        // String methods

        String name = "Ram Shyam";
        int length = name.length();
        System.out.println(length);
        char c = name.charAt(6);
        System.out.println(c);

        String name2 = "Ram Shaym";
        System.out.println(name.equals(name2));
        // check equality

String str1 = "Remote";
String str2 = "car";
int i = str1.compareTo(str2);
        System.out.println(i);

// Find substring
        String Name = "Amar Panchal";
        String substring= name.substring(5);
        System.out.println(substring);

String preName = "Amar Panchal ";
        System.out.println(preName.toUpperCase());
        System.out.println(preName.toLowerCase());
        System.out.println(preName.toLowerCase());
        System.out.println(preName.trim()); // trim remove the space

        // in java string are immutable
        //Always generate new string

        String newName = name.replace("Panchal", "Sharma");
        System.out.println(newName);

        System.out.println(name.contains("p"));
        System.out.println(name.contains("a"));
       System.out.println(name.contains("pon"));
       System.out.println(name.contains("aaa"));

        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("L"));
        System.out.println(name.isBlank());




    }
}
