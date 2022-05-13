package ua.ithille.neu.features.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        EmployeeDTO dto = new EmployeeDTO("Maks", "Hillel", 88);
        demo3();
    }

    static void demo5() {
        List.of();
        Set.of();
        Map.of("hello", 1, "world", 2);
    }

    static void demo4() {
        var values = "Hello, world!";
    }

    static void demo3() {
        Optional<String> mayBeValue = Optional.ofNullable("Hello, world!");
        mayBeValue.ifPresent(value -> System.out.println(value));

        String value = mayBeValue.orElseThrow();

        Optional.of(value).orElseThrow();
    }

    /**
     * Source - data where stream may start
     * Intermediate operation - closes existing stream and takes over next one
     * Terminal operation - closes stream
     */
    static void demo2() {
        List<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(101);
        digits.add(-9);
        digits.add(0);
        digits.add(88);
        digits.add(-264);
        digits.add(-881);
        digits.add(-9);
        digits.add(8916247);

        digits.stream()
                .filter(digit -> digit > 0)
                .map(Double::valueOf)
                .forEach(System.out::println);

        digits.forEach(digit -> System.out.println("Value: " + digit));

        Optional<Integer> mayBeFirst = digits.stream()
                .filter(digit -> digit < 0)
                .findFirst();

        if (digits.stream().noneMatch(digit -> digit > 10000000000L)) {
            System.out.println("Non more than mnogo...");
        }

        digits.stream()
                .filter(digit -> digit > 0)
                .map(Double::valueOf)
                .toList();
    }

    static void demo1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, world!");
                System.out.println("I am functional interface!");
            }
        });

        new Thread(() -> {
            System.out.println("Hello, world!");
            System.out.println("I am functional interface!");
        });

        Supplier<Double> cubeSquareSuppler = () -> 10D + 10 + 11 + 16;
        Consumer<String> messageConsumer = message -> System.out.println(message);

        messageConsumer.accept("Hello, world!");
    }
}
