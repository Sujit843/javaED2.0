package Collection_Framework.List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Example {
    public static void main(String[] args)  throws Exception{

       // ArrayList<Integer> list = new ArrayList<>();  // not give correct ans.
        Vector<Integer> list = new Vector<>();
        Thread t1  = new Thread(()->{
            for ( int i = 0; i < 1000; i++){
                list.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                list.add(i);
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        System.out.println("size list:" + list.size());


        // output : random , 1679,7889 etc.
        // kyuki array synchronized nhi he yaha dono thread simultaneously chal raha he
        // vector is give correct ans kyuki vector synchronized he
    }
}
