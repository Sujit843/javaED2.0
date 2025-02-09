package CoreJava7.JavaLoop;

public class Loops {
    public static void main(String[] args){

      // while loop
     /*   int i = 0;
        while (i < 10){
            System.out.println("hello");
            i = i + 1;
        }*/

 /*    int i = 0;
     while (i < 51){
    System.out.println(i);
    i = i +1;
    }*/

    // do - while loop
    /*       int i = 100;
        do{
            System.out.println(i);
            i= i+1;
        }while ( i <= 50);*/

// for loop
     /*   int i = 1;
        for ( i = 1; i <=50; i++){
            System.out.println(i);
        }*/

        /*
        *  1
        *  10
        *  100
        *  1000
        *  10000
        *  100000
        * */ // print the pattern

     /*   int i = 1;
        for ( i=1;  i<=100000; i= i*10){
            System.out.println(i);
        }*/

        /*
            *
            * *
            * **
            * ***
            * ****
     // print the pattern
        * */

for (int i = 1; i <=5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print('*');
    }
    System.out.println();
}


    // print table of 8
/*
        int i = 1;
for( i = 1;  i<=10; i++){
    System.out.println(i + " X 7 =" + i * 8);
}
*/

// print the sum of first 10 natural number
int sum =0;
for( int i = 1; i <= 10; i++) {
    sum = sum + i;
}
        System.out.println(sum);

// count digits
/*        int n = 789045573;
        int res = 0;
       while( n>0){
           n=n/10;
           res++;
       }
        System.out.println(res);*/

       // print tha factorial of 6
        // 6! = 6.5.4.3.2.1
        int i = 6;
        int res = 1;
        while( i > 0){
            res = res * i;
            i--;
        }
        System.out.println(res);


    }
}
