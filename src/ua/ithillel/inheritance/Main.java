package ua.ithillel.inheritance;

import ua.ithillel.inheritance.deeper.OilEngine;

public class Main {
    public static void main(String[] args) {
        double[] emptyArr = new double[0];
        System.out.println(emptyArr);

        ElectricityEngine electricityEngine = new ElectricityEngine("Elc V4");
        electricityEngine.start();
        System.out.println(electricityEngine);

        WaterEngine waterEngine = new WaterEngine("WT V6");
        waterEngine.start();

        OilEngine oilEngine = new OilEngine();
        oilEngine.start();
    }
}
