package ua.ithillel.exceptions;

public class CoordinateRangeException extends Exception {
    public CoordinateRangeException(String message) {
        super(message);
    }

    public CoordinateRangeException(String message, Throwable cause) {
        super(message, cause);
    }
}
