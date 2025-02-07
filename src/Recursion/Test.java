package Recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfNaturalNumber(6));
    /*public static int  factorial(int n ){
        int res =  1;
         for( int i = 1; i <= n; i++){
             res= res*i;
         }
         return res;*/

    }
//  Recursion 1
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);  // recursion 1
    }
    // Recursion 2
    public static int sumOfNaturalNumber(int n){
        if (n == 1){
            return 1;
        }
        return n + sumOfNaturalNumber(n-1);

    }
}
