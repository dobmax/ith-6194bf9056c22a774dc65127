package ua.ithillel.oop.printers;

public class StdoutPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("[StdoutPrinter] Printing to Standard Output Steam...");
    }

    public void printOut() {
        System.out.println("Printing out...");
    }
}
