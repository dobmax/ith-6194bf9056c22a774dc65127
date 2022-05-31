package ua.ithille.neu.features.homework;

import java.time.LocalDate;

public class Product {
    private Type type;
    private float price;
    private boolean discountable;
    private LocalDate createdAt;

    public Product(Type type, float price, boolean discountable, LocalDate createdAt) {
        this.type = type;
        this.price = price;
        this.discountable = discountable;
        this.createdAt = createdAt;
    }

    public Type getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isDiscountable() {
        return discountable;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public enum Type {
        BOOK
    }
}
