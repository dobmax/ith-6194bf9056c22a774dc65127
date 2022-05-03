package ua.ithillel.concurrency.classwork;

public class NonThreadSafeCounter implements Counter {

    private int val;

    public void increase() {
        val++;
    }

    public int getVal() {
        return val;
    }

}
