package synchrinization;

public class SyncronizationApp {

    public static void main(String[] args) {
        Counter counter =  new Counter();
        new Thread(counter , "one").start();
        new Thread(counter , "two").start();
        new Thread(counter , "three").start();
        new Thread(counter , "four").start();

        //System.out.println("final counter value is " +counter.getCounter());
    }
}
