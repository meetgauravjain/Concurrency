package advanced_api;

import classic_api.PrimeNumberCalculator;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {

        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newCachedThreadPool();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number . enter n: ");
            int n = scanner.nextInt();
            if (n==0) break;
            PrimeNumberCalculator r = new PrimeNumberCalculator();
            r.setN(n);
            executorService.execute(r);
        }
    }
}
