package CoreJava7.Array;

public class Array {
    public static void main(String[] args) {

       int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[6] = 78;
            arr[8] = 90;
            System.out.println(arr[i]);
        }

        int[] arr1 = new int [10];
        arr1[2] = 78;
            for( int i : arr1){
            System.out.println(i);
        }

        // search  number in array  list
        int arr7[] = {1, 2, 44 ,55, 66,};
        for( int i : arr7){
            if (i==55 );
        }
        System.out.println("found  55" );

//  fin largest number in array list
   /*     int arr[] = new int [5];
        arr[0] = 22;
        arr[1] = 45;
        arr[3] = 77;
        arr[4] = 90;
        int res = Integer.MAX_VALUE;
        // Agar res = 0;  likhte he to hame negative dikkat hogi
        //  ex- jab element -22, -26, -58 ,ho
        for (int i = 0; i < 5; i++){
        res = arr[i];
        }
        System.out.println(res);*/

        // reverse loop
        int arr3[] = {1, 2, 4, 5, 6, 7, 8, };
        for (int i = arr3.length-1; i >=0;  i--){
            System.out.println(arr3[i]);
        }

        // sum of array element
        int arr4[] = {1, 2, 4, 6, 7, 4, };
        int sum = 0;
        for ( int i = 0; i < 6; i++){
            sum = sum + arr4[i];
        }
        System.out.println(sum);

        // 2D array
        int arr5[][]= new int [3][4];
        int[][] nums= {
                {1, 2, 4 ,5},
                {2, 3, 4, 5,},
                {4, 5, 6, 7,},
                {6, 7, 9, 9,}
        };
        for ( int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums [i][j] +" ");
            }
            System.out.println();
        }

        char arr6[][] = new char [3][2];
        arr6[0][0] =  'a';
        arr6[0][1] =  'b';
        arr6[1][0] =  'c';
        arr6[1][1] =  'd';
        arr6[2][0] =  'e';
        arr6[2][1] =  'f';
        for ( int i = 0; i < arr6.length;  i++){
            for (int j = 0; j < arr6[i].length; j++){
                System.out.print(arr6[i][j] + " ");
            }
            System.out.println();
        }






    }
}
