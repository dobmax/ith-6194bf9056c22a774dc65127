package ua.ithillel;

/**
 * T - type
 * E - element
 * K - key
 * V - value
 * ID - identifier
 */
public class GenericContainer<T> {
    private final T val;

    public GenericContainer(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
