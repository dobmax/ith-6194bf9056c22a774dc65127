package ua.ithillel.classwork;

public class Main {
    /**
     * JAR - Java Archive
     * 1. Library
     * 2. Executable. Must contain entry-point (in other word, method main)
     */
    public static void main(String[] args) {
        new HelloWorld().greeting(args[0]);
    }
}
