package ua.ithillel.homework.fx.calculator;

import java.io.InputStream;

class ResourceLoader {

    public InputStream load() {
        InputStream resource = getClass().getClassLoader().getResourceAsStream("fx-rates.txt");
        if (resource == null) throw new RuntimeException("FX rates file was not found");
        return resource;
    }

}
