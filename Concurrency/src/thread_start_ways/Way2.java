package thread_start_ways;

public class Way2 implements Runnable{
    @Override
    public void run() {
        System.out.println(" I am a child thread " + "My name is " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(" I am a Main thread " + "My name is " + Thread.currentThread().getName());
        Thread t = new Thread(new Way2());
        t.start();
        System.out.println(t.getName());
    }
}
