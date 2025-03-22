package Generics.Generics_Method;

import javax.lang.model.element.Element;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Test <T> {
    public void main(String[] args) {

        Integer []  intArray = {1,2,3,4};
        String[] stringArray = {"hello", "world"};
      /*
        public   static void display   (T element){
            System.out.println("Generic display :" + element );
        }
        public static void display (Integer element ){
            System.out.println("Integer display " + element );
        }

        public static <T> void PrintArray (T[] array){
            for(T element : array){
                System.out.println(element + " ");
            }
        /**/
    }
}
