package ua.ithillel.reflection.and.annotations.classwork;

public class TestContainer {

    private Object value;

    public TestContainer(@NonNull Object value) {
        this.value = value;
    }

    public TestContainer(@NonNull("Boolean value must be instantiated.") boolean value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "TestContainer{" +
                "value=" + value +
                '}';
    }
}
