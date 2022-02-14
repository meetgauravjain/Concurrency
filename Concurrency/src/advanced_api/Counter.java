package advanced_api;

public class Counter implements Runnable{

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter() {
         counter++;
    }

    public void decrementCounter() {
        counter--;
    }


    @Override
    public void run() {

        synchronized (this) {
            this.incrementCounter();
            System.out.println(Thread.currentThread().getName() + " increments " + this.getCounter());
            this.decrementCounter();
            System.out.println(Thread.currentThread().getName() + " increments " + this.getCounter());
        }
    }
}
