package ua.ithillel.concurrency.classwork;

public class OneMillionCounterIncrementor implements Runnable {

    private final Counter counter;

    public OneMillionCounterIncrementor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.increase();
        }
    }

}
