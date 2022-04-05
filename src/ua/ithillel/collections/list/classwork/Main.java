package ua.ithillel.collections.list.classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
        Collection<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(",");
        strings.add(" ");
        strings.add("World");
        strings.add("!");


    }

    static void doForIterationDemo(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
        }
        System.out.println();
    }

    static void doSpliteratorDemo(Collection<String> strings) {
        Spliterator<String> spliterator = strings.spliterator();
    }

    static void doIteratorDemo(Collection<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }
}
