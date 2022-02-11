package classic_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadStateExample {
    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>();
        Runnable r1 = () -> {
            while(true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printThreadState(list);
            }};
        Thread thread = new Thread(r1);
        thread.setDaemon(true);
        thread.start();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number . enter n: ");
            int n = scanner.nextInt();
            if (n==0) break;
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
}
