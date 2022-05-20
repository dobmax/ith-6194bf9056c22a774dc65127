package ua.ithillel.io.homework;

public enum LoggingLevel {
    INFO(0),
    DEBUG(1),
    TRACE(2);

    private final int ordering;

    LoggingLevel(int ordering) {
        this.ordering = ordering;
    }

    public int ordering() {
        return ordering;
    }
}
