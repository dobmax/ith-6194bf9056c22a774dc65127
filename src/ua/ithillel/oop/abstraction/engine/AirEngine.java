package ua.ithillel.oop.abstraction.engine;

public class AirEngine extends BasicEngine {
    @Override
    protected void prepare() {
        System.out.println("The process starts Air engine...");
        System.out.println("Air fan activated...");
        System.out.println("Air fan engine activated...");
    }
}
