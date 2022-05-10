package ua.ithillel.collections.list.homework.coffee.order;

public class Order {
    private final int order;
    private final String name;

    public Order(int order, String name) {
        this.order = order;
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }
}
