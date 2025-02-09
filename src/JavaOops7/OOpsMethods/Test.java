package OOpsMethods;

public class Test {
    public static void main(String[] args) {

         boolean nums = isPrime(75);
         boolean nums1 = isPrime(7);
         boolean nums2= isPrime(91);
        System.out.println(nums);
        System.out.println(nums1);
        System.out.println(nums2);


        int res4 = sumOfMultiple( 12, 4, 5,78,8 );
        System.out.println(res4);

        int res3 = sumOfDigit(3, 4, 6);
        System.out.println(res3);


        int res2= sumOfDigit( 7, 6);
        System.out.println(res2);

  String res1 =  upperFun("  sujit  ");
        System.out.println(res1);

        int arr1[] = {12, 34, 23, 45, };
        sumOfArray(arr1);
        // Yaha Hamne usi method ko call karke
        // easily sum nikal Rahe he


        int a = 2;
         int b = 2;     // sum of two number
          int c = a+b ;
        System.out.println("sum :" + c);

    int arr[] = {1, 2, 4, 6,7 };
    int res =0;
    for ( int i : arr){                // sum array list element
        res +=i ;
    }
        System.out.println(res);
    }
   // hamne ak method Banaya he jisse hame bar bar sum nikalne ki need nhi he
   // ham ko jab bhi sum nikalna he array ka to ham sumofarray ko call kar denge

    // Method 1
    public static void sumOfArray(int arr[]) {
       // int arr[] = {1, 2, 4, 6, 7};
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        System.out.println(res);
    }
// Method 2
public static String upperFun(String str){
       return  str.trim().toUpperCase();
}
// Method 3
public static int  sumOfDigit(int a, int b){
        return ( a + b);
}
// Method 4
    public static int sumOfDigit(int a, int b, int c) {
    return a+b+c;
    }
// Method 5
    public static int  sumOfMultiple( int...a){
        int sum = 0;
        for (int i : a){
            sum = sum + i;
        }
        return sum;
    }
    // Method 6
    public static boolean isPrime(int x){
        int nums = 0;
        for( int i = 1; i < x/2; i++){
            if (x % i == 0);
            nums++;
        }
        return nums == 2;
    }
    }





