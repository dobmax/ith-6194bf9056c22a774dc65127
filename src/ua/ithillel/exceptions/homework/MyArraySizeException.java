package ua.ithillel.exceptions.homework;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
