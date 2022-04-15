package ua.ithillel;

public class AbstractCharSequenceContainer<T extends CharSequence> extends GenericContainer<T> {
    public AbstractCharSequenceContainer(T val) {
        super(val);
    }
}
