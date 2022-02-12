package classic_api;

public class PrimeNumberCalculator implements Runnable {

    int n;

    @Override
    public void run() {
        int number = CalculatePrime.calculatePrime(n);
        System.out.println("\n Results");
        System.out.println("\n value of " + n + "th prime: " + number);
    }
    public void setN(int n) {
        this.n = n;
    }
}
