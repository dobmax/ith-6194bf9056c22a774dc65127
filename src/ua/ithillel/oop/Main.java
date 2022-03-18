package ua.ithillel.oop;

import ua.ithillel.oop.printers.PdfPrinter;
import ua.ithillel.oop.printers.Printer;
import ua.ithillel.oop.printers.StdoutPrinter;

public class Main {
    public static void main(String[] args) {
        testGoodAbstractionOfPrinters();
    }

    static void testGoodAbstractionOfPrinters() {
        Printer[] printers = getPrinters();

        for (int i = 0; i < printers.length; i++) {
            System.out.println(printers[i]);
            printers[i].print();
        }
    }

    static Printer[] getPrinters() {

        return new Printer[]{new StdoutPrinter(), new PdfPrinter()};
    }

    static void testBadPolymorphism() {
        Object[] printers = getPrintersWrong();

        for (int i = 0; i < printers.length; i++) {
            if (printers[i] instanceof StdoutPrinter pout) {
                pout.printOut();
            } else if (printers[i] instanceof Printer printer) {
                printer.print();
            } else {
                System.out.println("none");
            }
        }
    }

    static Object[] getPrintersWrong() {

        return new Object[]{new StdoutPrinter(), 1, 2D, "Str"};
    }

    static void testPolymorphism() {
        Object[] objects = getObjects();

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }

    static Object[] getObjects() {

        return new Object[]{new StdoutPrinter(), 1, 2D, "Str"};
    }
}
