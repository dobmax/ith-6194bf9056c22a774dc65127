package ua.ithillel.testing.classwork;

public final class MathUtils {

    private MathUtils() {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        throw new Error("Method is not implemented yet.");
    }

    public static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divider cannot be zero.");
        return a / b;
    }

}
