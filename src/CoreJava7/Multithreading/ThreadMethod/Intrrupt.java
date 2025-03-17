package CoreJava7.Multithreading.ThreadMethod;

public class Intrrupt extends Thread  {
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println( " Thread is running...");
        }catch(Exception e){
            System.out.println("Thread is intrrupted.." + e);
        }
    }

    public static void main(String[] args) {
        Intrrupt t1 = new Intrrupt();
        t1.start();
        t1.interrupt();
        // jis method par intrrupt laga diye iska matlb usko ap bol rhe ho wahi ruk jao
        // agar wait me he to wait me hi rhega

    }
}
