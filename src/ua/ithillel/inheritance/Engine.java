package ua.ithillel.inheritance;

/**
 * Любой класс-прородитель неявно наследуется от класса Object
 */
public class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        Object obj = model + " Engine is starting ...";
        System.out.println(obj);
    }
}
