package ua.ithillel.concurrency.classwork;

public class LinearConcurrency {
    static synchronized int get() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
