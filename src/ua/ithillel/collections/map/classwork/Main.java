package ua.ithillel.collections.map.classwork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        demo5();
    }

    static void demo5() {
        Set<CategoryKey> categories = new TreeSet<>(new Comparator<CategoryKey>() {
            @Override
            public int compare(CategoryKey o1, CategoryKey o2) {
                return o1.getOrderNum() - o2.getOrderNum();
            }
        });
        CategoryKey key4 = new CategoryKey("0", 187264);
        CategoryKey key1 = new CategoryKey("1", 0);
        CategoryKey key2 = new CategoryKey("2", 1872);
        CategoryKey key3 = new CategoryKey("3", -99);

        System.out.println(key1.equals(key2));

        categories.add(key1);
        categories.add(key2);
        categories.add(key3);
        categories.add(key4);

        for (CategoryKey key: categories) {
            System.out.println(key);
        }
    }

    static void demo4() {
        Set<Integer> categories = new HashSet<>();
        categories.add(1);
        categories.add(3);
        categories.add(4);
        categories.add(2);
        categories.add(0);

        for (Integer key: categories) {
            System.out.println(key);
        }
    }

    static void demo3() {
        Set<CategoryKey> categories = new HashSet<>();
        CategoryKey key4 = new CategoryKey("0", 187264);
        CategoryKey key1 = new CategoryKey("1", 187264);
        CategoryKey key2 = new CategoryKey("2", 187264);
        CategoryKey key3 = new CategoryKey("3", 187264);

        System.out.println(key1.equals(key2));

        categories.add(key1);
        categories.add(key2);
        categories.add(key3);
        categories.add(key4);

        for (CategoryKey key: categories) {
            System.out.println(key);
        }
    }

    static void doDemo2() {
        Map<CategoryKey, List<String>> library = new HashMap<>();

        CategoryKey history = new CategoryKey("history", 187264);
        List<String> historyBooks = new ArrayList<>();
        historyBooks.add("Roman Empire");
        historyBooks.add("Otaman Empire");
        library.put(history, historyBooks);

        CategoryKey historyClone = new CategoryKey("history", 187264);
        List<String> historyBooks2 = new ArrayList<>();
        historyBooks2.add("Egypt");
        historyBooks2.add("Encient Greece");
        library.put(historyClone, historyBooks2);

        System.out.println(library);

    }

    static void doDemo1() {
        Map<String, List<String>> library = new HashMap<>();

        List<String> historyBooks = new ArrayList<>();
        historyBooks.add("Roman Empire");
        historyBooks.add("Otaman Empire");
        library.put("history", historyBooks);

        List<String> programmingBooks = new ArrayList<>();
        programmingBooks.add("Effective Java");
        programmingBooks.add("Data Structures");
        library.put("programming", programmingBooks);


        System.out.println(library);
        System.out.println(library.get("history"));
        System.out.println(library.get("math"));

        library.put("programming", List.of("C\\C++", "C#"));
        System.out.println(library);

        String key1 = "key";
        String key2 = new String("key");
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
    }
}
