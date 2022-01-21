package package1;

public class PrimeNumberCalculator implements Runnable {

    int n;

    @Override
    public void run() {
        int number = CalculatePrime.calculatePrime(n);
        System.out.println("\n Results");
        System.out.println("\n value of " + n + "th prime: " + number);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
