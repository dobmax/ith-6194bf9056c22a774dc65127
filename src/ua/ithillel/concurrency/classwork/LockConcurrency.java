package ua.ithillel.concurrency.classwork;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockConcurrency {

    private int val;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increase() {
        try {
            lock.writeLock().lock();
            val++;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int getVal() {
        try {
            lock.readLock().lock();
            Thread.sleep(2000);
            return val;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.readLock().unlock();
        }
    }

}
