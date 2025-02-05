package conditional;

public class logical {
    public static void main(String[] args){

        //   logical operator
        //   (&&) logical And
        //   (||) logical OR
        //    (!) logical NOT

        int ramMarks = 35;
        int ramAge =50;
        System.out.println(ramMarks>=100 && ramAge>18);
        // isme both condition satisfy hona chahiye

        String name = "Ram";
        int exp = 2;
        boolean cond1 = exp>=5;
        boolean tier1= true;
        System.out.println(tier1 || cond1);
        // isme ak condition satisfy ho atleast

        System.out.println(!(2 > 3));
    }
}


