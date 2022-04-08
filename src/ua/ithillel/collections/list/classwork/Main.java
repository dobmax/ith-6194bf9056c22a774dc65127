package ua.ithillel.collections.list.classwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        strings.addAll(getStrings());

        ListIterator<String> nextListIter = strings.listIterator(3);
        while (nextListIter.hasNext()) {
            System.out.println(nextListIter.next());
        }

        System.out.println();
        System.out.println("=====");
        System.out.println();

        ListIterator<String> prevListInter = strings.listIterator(3);
        while (prevListInter.hasPrevious()) {
            System.out.println(prevListInter.previous());
        }
    }

    static List<String> getStrings() {

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(",");
        strings.add(" ");
        strings.add("World");
        strings.add("!");
        return strings;
    }

}
