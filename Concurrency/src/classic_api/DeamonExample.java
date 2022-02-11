package classic_api;

import java.util.Scanner;

public class DeamonExample {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number . enter n: ");
            int n = scanner.nextInt();
            if (n==0) break;
            PrimeNumberCalculator r = new PrimeNumberCalculator();
            r.setN(n);
            Thread t = new Thread(r);
            // set deamon to true
            t.setDaemon(true);
            t.start();
        }
        System.out.println("Ending the application");
    }
}
