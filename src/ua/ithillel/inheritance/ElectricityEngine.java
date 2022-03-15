package ua.ithillel.inheritance;

/**
 * Это и есть техническое проявление наследования, слово `extends`
 */
public class ElectricityEngine extends Engine {
    int capacity = 100;
    int amount = 98;

    public ElectricityEngine(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " electro engine started...");
    }

    @Override
    public String toString() {
        return "ElectricityEngine{" +
                "capacity=" + capacity +
                ", amount=" + amount +
                '}';
    }
}
