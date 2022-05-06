package ua.ithillel.concurrency.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws Exception {
        demo5();
    }

    static void demo5() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        CargoShip cargoShip = new CargoShip();
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> cargoShip.add());
        }

        executorService.shutdown();
    }

    static void demo4() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CyclicBarrier cb = new CyclicBarrier(3);

        executorService.submit(() -> {
            try {
                Thread.sleep(1400);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("start #1");
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(2500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("start #2");
        });
        executorService.submit(() -> {
            try {
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("start #3");
        });

        executorService.shutdown();
    }

    static void demo3() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch cdl = new CountDownLatch(5);
        LockConcurrency lockConcurrency = new LockConcurrency();

        long start = System.currentTimeMillis();

        executorService.submit(lockRunnable(lockConcurrency, cdl));
        executorService.submit(lockRunnable(lockConcurrency, cdl));
        executorService.submit(lockRunnable(lockConcurrency, cdl));
        executorService.submit(lockRunnable(lockConcurrency, cdl));
        executorService.submit(lockRunnable(lockConcurrency, cdl));

        executorService.shutdown();
        cdl.await();
        System.out.println("Operation took: " + (System.currentTimeMillis() - start));
    }

    static Runnable lockRunnable(LockConcurrency lockConcurrency, CountDownLatch cdl) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(lockConcurrency.getVal());
                cdl.countDown();
            }
        };
    }

    static void demo2() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch cdl = new CountDownLatch(5);

        long start = System.currentTimeMillis();

        executorService.submit(linearRunnable(cdl));
        executorService.submit(linearRunnable(cdl));
        executorService.submit(linearRunnable(cdl));
        executorService.submit(linearRunnable(cdl));
        executorService.submit(linearRunnable(cdl));

        executorService.shutdown();
        cdl.await();
        System.out.println("Operation took: " + (System.currentTimeMillis() - start));
    }

    static Runnable linearRunnable(CountDownLatch cdl) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(LinearConcurrency.get());
                cdl.countDown();
            }
        };
    }

    static void demo1() throws Exception {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newCachedThreadPool(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Callable<String>> callables = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            callables.add(callable(i));
        }

        List<Future<String>> futures = executorService.invokeAll(callables);

        executorService.shutdown();
    }

    static Callable<String> completableCallable(int inc) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return inc + ": Hello, world!!!";
            }
        };
    }

    static Callable<String> callable(int inc) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return inc + ": Hello, world!!!";
            }
        };
    }

}
