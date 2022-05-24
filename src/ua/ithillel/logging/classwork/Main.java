package ua.ithillel.logging.classwork;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Log4j2
    private static final Logger log = LogManager.getLogger(Main.class);

    // Logback
    // For future

    public static void main(String[] args) {
        log.info("Application up&running!!!!");
        log.warn("Something suspicious is going on ....");
        log.error("Something went wrong ....", new RuntimeException("SWW2", new IllegalArgumentException("Original SWW")));
        log.debug("It is not gonna needed...!!!");
    }
}
