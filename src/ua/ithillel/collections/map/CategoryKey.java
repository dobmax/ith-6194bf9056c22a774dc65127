package ua.ithillel.collections.map;

import java.util.Objects;

public class CategoryKey {
    private String name;
    private int orderNum;

    public CategoryKey(String name, int orderNum) {
        this.name = name;
        this.orderNum = orderNum;
    }

    public String getName() {
        return name;
    }

    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryKey that = (CategoryKey) o;
        return orderNum == that.orderNum && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orderNum);
    }

    @Override
    public String toString() {
        return "CategoryKey{" +
                "name='" + name + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
