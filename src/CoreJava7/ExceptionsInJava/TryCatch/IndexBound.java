package CoreJava7.ExceptionsInJava.TryCatch;

public class IndexBound {
    public static void main(String[] args) {

        int[] numerators = {10, 200, 30, 40 };
        int[] denominators = { 1, 2, 0 ,4};
        // yaha loop ko 10 tk chala diya he hamne
        // to index bound exception ayega
        for ( int i = 0; i < 10; i++){
            try{
                System.out.println(divide(numerators[i], denominators[i]));
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println(" Good Job ..");
    }
    public static int divide (int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        }
    }
    }

