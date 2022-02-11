package thread_start_ways;

public class Way2Java8Way {
    public static void main(String[] args) {
        System.out.println(" I am a Main thread " + "My name is " + Thread.currentThread().getName());
        new Thread(() -> System.out.println(" I am a Child thread " + "My name is " + Thread.currentThread().getName())).start();
    }
}
