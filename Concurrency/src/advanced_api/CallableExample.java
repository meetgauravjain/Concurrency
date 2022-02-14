package advanced_api;

import classic_api.CalculatePrime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Future<Integer>> futures = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number . enter n: ");
            int n = scanner.nextInt();
            if (n==0) break;
            Callable<Integer> callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return CalculatePrime.calculatePrime(n);
                }
            };

            Future<Integer> primeNumberFuture = executorService.submit(callable);
            futures.add(primeNumberFuture);
            Iterator<Future<Integer>> iterator = futures.iterator();

            while (iterator.hasNext()){
                Future<Integer> f = iterator.next();

                if (f.isDone()) {
                    try {
                        System.out.println(f.get());
                        iterator.remove();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
