package package1;
import java.util.Scanner;
public class PrimeNumberApplication {
    public static void main(String[] args) {
        int number;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number . enter n: ");
            int n = scanner.nextInt();
            if (n==0) break;
            PrimeNumberCalculator r = new PrimeNumberCalculator();
            r.setN(n);
            Thread t = new Thread(r);
            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
