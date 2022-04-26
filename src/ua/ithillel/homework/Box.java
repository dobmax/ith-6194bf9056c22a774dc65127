package ua.ithillel.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    // VARARGS
    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public float size() {
        if (fruits.isEmpty()) {
            return 0F;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box<? extends Fruit> other) {
        return size() == other.size();
    }

    public void merge(Box<T> other) {
        fruits.addAll(other.fruits);
        other.fruits.clear();
    }

}
