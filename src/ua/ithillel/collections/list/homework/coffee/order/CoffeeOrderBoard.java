package ua.ithillel.collections.list.homework.coffee.order;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CoffeeOrderBoard {
    private final Deque<Order> orders = new LinkedList<>();

    public void add(String name) {
        int orderNumber;
        try {
            orderNumber = orders.getLast().getOrder() + 1;
        } catch (NoSuchElementException e) {
            orderNumber = 1;
        }
        orders.add(new Order(orderNumber, name));
    }

    public Order deliver() {
        return orders.removeFirst();
    }

    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrder() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num   |  Name");
        for (Order order : orders) {
            System.out.printf("%s    %s%n", order.getOrder(), order.getName());
        }
    }
}
