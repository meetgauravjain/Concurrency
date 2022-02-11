package thread_start_ways;

public class Way1 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.getAllStackTraces());
        System.out.println("I am a child thread");
    }

    public static void main(String[] args) {
        Way1 way1 = new Way1();
        System.out.println("I am a main thread");
        System.out.println(Thread.currentThread());
        way1.start();
    }
}
