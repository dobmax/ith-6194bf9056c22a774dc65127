package ua.ithillel.encapsulation.homework;

/**
 * SRP - Single Responsibility Principle
 * Принцип единой ответственности или проще "Делай только одну вещь"
 * Clean Architecture - R. Martin
 */
public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {

    }

    private void startCommand() {

    }

    private void startFuelSystem() {

    }

}
