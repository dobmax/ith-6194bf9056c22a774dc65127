package ua.ithillel.exceptions.classwork;

public class CoordinateOutRangeException extends RuntimeException {
    public CoordinateOutRangeException(String message) {
        super(message);
    }

    public CoordinateOutRangeException(String message, Throwable cause) {
        super(message, cause);
    }
}
