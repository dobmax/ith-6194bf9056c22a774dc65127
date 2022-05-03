package ua.ithillel.concurrency.classwork;

public class ThreadSafeCounter implements Counter {

    private int val;

    public synchronized void increase() {
        val++;
    }

    public synchronized int getVal() {
        return val;
    }

}
