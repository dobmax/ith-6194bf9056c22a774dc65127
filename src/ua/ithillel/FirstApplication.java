package ua.ithillel;

import java.util.ArrayList;
import java.util.List;

public class FirstApplication {
    public static void main(String[] args) {

    }

    static void genericContainerDemo3() {
        CharSequenceUtils.shuffle(new StringBuilder());
        CharSequenceUtils.shuffle("1L");
        CharSequenceUtils.cast(String.class);
        CharSequenceUtils.cast(StringBuilder.class);
        CharSequenceUtils.castBad(StringBuilder.class);
        CharSequenceUtils.castBad(Integer.class);
    }

    static void genericContainerDemo2() {
        AbstractCharSequenceContainer<String> strSequence = new AbstractCharSequenceContainer<>("Hello, world!");
        AbstractCharSequenceContainer<StringBuilder> sbSequence = new AbstractCharSequenceContainer<>(new StringBuilder("Hello, world!"));
    }

    static void genericContainerDemo() {
        GenericContainer<String> c1 = new GenericContainer<>("4L");
        GenericContainer<List<String>> c2 = new GenericContainer<>(List.of("1", "4"));

        String sum = c1.getVal() + c2.getVal();
        System.out.println("Sum: " + sum);
    }

    static void genericRawTypeListDemo() {
        List values = new ArrayList<>();
        values.add("23");
        values.add(1L);
        values.add(1D);
    }

    static void patternMatchingForInstanceOfForNonGenericType() {
        NonGenericContainer c1 = new NonGenericContainer(4L);
        NonGenericContainer c2 = new NonGenericContainer("6L");

        if (c1.getVal() instanceof Long cast1 && c2.getVal() instanceof Long cast2) {
            long sum = cast1 + cast2;
            System.out.println(sum);
        } else {
            System.out.println("Cannot cast!!!");
        }
    }

    static void classicInstanceOfForNonGenericType() {
        NonGenericContainer c1 = new NonGenericContainer(4L);
        NonGenericContainer c2 = new NonGenericContainer(6L);

        if (c1.getVal() instanceof Long && c2.getVal() instanceof Long) {
            long sum = (long) c1.getVal() + (long) c2.getVal();
            System.out.println(sum);
        } else {
            System.out.println("Cannot cast!!!");
        }
    }
}
