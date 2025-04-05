package StringBuilder_StringBuffer;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        // String builder ka use modification me hota he
        // jab hame string me  bar bar modify karna ho then use SB
        // yeh mutable hota he
        // yeh thread safe nhi he
        // thread safe ke lliye hame String buffer ka use karna hoga


        StringBuilder  sb = new StringBuilder();
       /* String s1 = "hello";
        sb.append("world").append("!");
        String string = sb.toString();*/

        Task t1 = new Task(sb);
        Task t2 = new Task (sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Length: " +  sb.length());
    }
}
class Task extends Thread {
    private StringBuilder sb;

    public Task (StringBuilder sb) {
        this.sb= sb;
    }
    public void run(){
        for (int i = 0; i < 1000; i++){
            sb.append("a");
        }
    }


}