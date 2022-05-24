package ua.ithillel.concurrency.homework;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Tank {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private float size = 100F;

    public float get(float amount) {
        try {
            lock.writeLock().lock();
            size -= amount;
            return amount;
        } finally {
            lock.writeLock().unlock();
        }
    }

}
