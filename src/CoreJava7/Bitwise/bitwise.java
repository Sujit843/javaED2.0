package CoreJava7.Bitwise;

public class bitwise {
        public static void main(String[] args) {
            int a = 5;
// bitwise operator using for change the bits
            // bitwise only oprands on -
            // byte , short, int , long
            System.out.println(Integer.toBinaryString(a));

            // bitwise operator
            // And operator (&)
            // OR  (|)
            // XOR (^)
            //NOT (~)
            // Left shift (<<)
            //right shift(>>)
            // unsigned right shift (>>>)

            int b = 5 & 4; // multiplication
            //1  1 = 1 other 0
            System.out.println(b);

            int c = 5 | 7;
            System.out.println(c); // or that means (yaa)
            // 0  0  =  0 others 1

            int d = 6 ^ 7;
            System.out.println(d); // differ
            // 1  0 = 1
            // 0  0 = 0

            int e = 5;
            int f = ~e;
            System.out.println(f);
            // just opposite kar dega 0 he to 1
            // agar 1 he to 0


            int g = 2;
            int k = g << 2;
            System.out.println(k);
            System.out.println(Integer.toBinaryString(k));
            // same as right shift
        
        }
    }















