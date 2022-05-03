package ua.ithillel.concurrency.classwork;

public class BadPracticeThread extends Thread {
    @Override
    public void run() {
        System.out.println("Run badly!!!");
    }
}
