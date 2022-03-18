package ua.ithillel.oop.printers;

public class PdfPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("[PdfPrinter] Printing to PDF-file...");
    }
}
