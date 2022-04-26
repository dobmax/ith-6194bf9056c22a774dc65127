package ua.ithillel.classwork;

public class AbstractCharSequenceContainer<T extends CharSequence> extends GenericContainer<T> {
    public AbstractCharSequenceContainer(T val) {
        super(val);
    }
}
