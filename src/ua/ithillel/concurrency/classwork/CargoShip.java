package ua.ithillel.concurrency.classwork;

import java.util.concurrent.Semaphore;

public class CargoShip {

    private Semaphore semaphore = new Semaphore(3);

    public void add() {
        try {
            System.out.println("Thread is waiting...");
            semaphore.acquire();
            Thread.sleep(1500);
            System.out.println("Thread is done...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

}
