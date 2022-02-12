package classic_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoinInterreptExample {

    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>();
        Runnable runnable = () -> {
            while(true) {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                printThreadState(list);
            }};
        Thread reporterThread = new Thread(runnable);
        reporterThread.setDaemon(true);
        reporterThread.start();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number . enter n: ");
            int n = scanner.nextInt();
            if (n==0) {
                reporterThread.interrupt();
                System.out.println("Waiting for all threads to finish..");
                try {
                    waitForThreads(list);
                    System.out.println("Done with application total thread executed today were" + list.size());
                } catch (InterruptedException e) {
                    System.out.println("Got Interrupted while Waiting for all threads to finish..");
                }
                break;
            }
            PrimeNumberCalculator r = new PrimeNumberCalculator();
            r.setN(n);
            Thread t = new Thread(r);
            list.add(t);
            t.start();
        }
        System.out.println("Ending application");
    }

    private static void printThreadState(List<Thread> list) {
        for (Thread t: list){
            System.out.println(t.getName() + "   " + t.getState());
        }
    }

    private static void waitForThreads(List<Thread> threads) throws InterruptedException {
        for (Thread t: threads){
            t.join();
        }
    }
}
