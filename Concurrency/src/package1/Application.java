package package1;

import org.w3c.dom.ls.LSOutput;

public class Application {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        Runnable r =  () -> System.out.println("aaa");
        new Thread( () ->System.out.println("aaa")).start();
    }
}
