package ua.ithillel.concurrency.homework;

import java.util.Arrays;

public class ValueCalculator {
    private static final int SIZE = 1_000_000;
    private static final int HALF_SIZE = SIZE / 2;

    private float[] arr = new float[SIZE];

    public void doCalc() throws Exception {
        long start = System.currentTimeMillis();
        Arrays.fill(arr, 1);

        float[] a1 = new float[HALF_SIZE];
        float[] a2 = new float[HALF_SIZE];

        System.arraycopy(arr, 0, a1, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, a2, 0, HALF_SIZE);

        Thread t1 = new Thread(() -> doCalc(a1));
        Thread t2 = new Thread(() -> doCalc(a2));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.arraycopy(a1, 0, arr, 0, HALF_SIZE);
        System.arraycopy(a2, 0, arr, HALF_SIZE, HALF_SIZE);

        System.out.println("Operation took: " + (System.currentTimeMillis() - start));
    }

    private void doCalc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
