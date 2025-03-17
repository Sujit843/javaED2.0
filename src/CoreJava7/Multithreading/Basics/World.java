package CoreJava7.Multithreading.Basics;

public class World implements Runnable {
                            // extends Thread bhi likh sakte he
    @Override
    public void run() {
      for (; ;){
          System.out.println("World");
      }
    }
}


