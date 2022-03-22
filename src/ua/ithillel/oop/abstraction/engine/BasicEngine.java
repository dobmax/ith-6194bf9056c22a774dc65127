package ua.ithillel.oop.abstraction.engine;

/**
 * 1. Насыщение абстракцию деталями
 * 2. Опредление будущего поведения (скрытый контракт)
 */
public abstract class BasicEngine implements Engine {

    /**
     * Design Pattern
     * Template method
     */
    protected abstract void prepare();

    @Override
    public void start() {
        System.out.println("Starting...");
        prepare();
        System.out.println("Completed...");
    }

}
