package MathInJava;

public class Test {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        int max=   Math.max(a,b);
        int min = Math.min(a,b);
        int c = -11;
        int dd  =   Math.abs(c);

        double d = 1.12;
        double ceil  = Math.ceil(d);
        System.out.println(ceil);
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        int e = 144;
        System.out.println(Math.sqrt(e));
        System.out.println(Math.pow(12 , 2));
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));

        System.out.println((int)Math.random() * 10 );


        // yaha abs ka mtlb he absuluate value
        // matlb koi negative value ko possitive me lana ho to use hoga

        System.out.println(d);
        System.out.println(max);
        System.out.println(min);


        // agar hame inko compair karna he to
        // ham math. ka use karenge

    }
    // pahle ham aise karte the
    private int max(int a , int b ){
        if( a > b){
            return a;
        }
        return b;
    }
}
