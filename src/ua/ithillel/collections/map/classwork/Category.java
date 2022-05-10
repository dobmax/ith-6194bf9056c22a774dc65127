package ua.ithillel.collections.map.classwork;

public class Category {
    private String name;
    private int orderNum;

    public Category(String name, int orderNum) {
        this.name = name;
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
