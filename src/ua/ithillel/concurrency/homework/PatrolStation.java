package ua.ithillel.concurrency.homework;

import java.util.concurrent.Semaphore;

public class PatrolStation {

    private final Semaphore semaphore = new Semaphore(3);
    private final Tank tank = new Tank();

    public void doFuel(float amount) {
        try {
            semaphore.acquire();
            System.out.println("Requested amount of fuel: " + tank.get(amount));
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            semaphore.release();
        }
    }

}
