package ua.ithillel.oop.abstraction.classwork;

import ua.ithillel.oop.abstraction.classwork.engine.AirEngine;
import ua.ithillel.oop.abstraction.classwork.engine.Engine;
import ua.ithillel.oop.abstraction.classwork.engine.WaterEngine;

public class Main {

    public static void main(String[] args) {
        Engine[] engines = getEngines();

        for (Engine engine : engines) {
            engine.start();
        }
    }

    static Engine[] getEngines() {

        return new Engine[]{new AirEngine(), new WaterEngine()};
    }

}
