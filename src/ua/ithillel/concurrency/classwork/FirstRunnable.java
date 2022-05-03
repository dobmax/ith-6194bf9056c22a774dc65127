package ua.ithillel.concurrency.classwork;

public class FirstRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, world!");
        System.out.println("I am a first class-based thread in parallel world!");
        System.out.println(Thread.currentThread().getName());
    }
}
