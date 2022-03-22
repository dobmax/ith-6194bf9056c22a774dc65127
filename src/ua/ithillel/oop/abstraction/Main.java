package ua.ithillel.oop.abstraction;

import ua.ithillel.oop.abstraction.engine.AirEngine;
import ua.ithillel.oop.abstraction.engine.BasicEngine;
import ua.ithillel.oop.abstraction.engine.Engine;
import ua.ithillel.oop.abstraction.engine.WaterEngine;

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
