package ua.ithillel.exceptions.homework;

public class Main {
    public static void main(String[] args) {
        String[][] values = {
                {"1", "1", "2", "4"},
                {"1", "1", "2", "4"},
                {"1", "1", "2", "4"},
                {"1", "1", "2", "A"},
        };
        new ArrayValueCalculator().calc(values);
    }
}
