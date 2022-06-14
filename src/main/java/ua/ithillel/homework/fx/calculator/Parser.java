package ua.ithillel.homework.fx.calculator;

@FunctionalInterface
public interface Parser<T, R> {
    R parse(T source);
}
