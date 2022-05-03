package ua.ithillel.concurrency.classwork;

public class Main {
    public static void main(String[] args) throws Exception {
        demo2();
    }

    static void demo2() throws Exception {
        ThreadSafeCounter nonThreadSafeCounter = new ThreadSafeCounter();

        Thread t1 = new Thread(new OneMillionCounterIncrementor(nonThreadSafeCounter));
        Thread t2 = new Thread(new OneMillionCounterIncrementor(nonThreadSafeCounter));
        Thread t3 = new Thread(new OneMillionCounterIncrementor(nonThreadSafeCounter));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(nonThreadSafeCounter.getVal());
    }

    static void demo1() {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, world!");
                System.out.println("I am a first thread in parallel world!");
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.start();

        new Thread(new FirstRunnable()).start();

        System.out.println(t1.getState());
    }
}
