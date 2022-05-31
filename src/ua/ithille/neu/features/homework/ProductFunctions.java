package ua.ithille.neu.features.homework;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class ProductFunctions {

    public List<Product> subjectOne(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals(Product.Type.BOOK) && product.getPrice() >= 250)
                .toList();
    }

    public List<Product> subjectTwo(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals(Product.Type.BOOK) && product.isDiscountable())
                .map(product -> {
                    product.setPrice(product.getPrice() - product.getPrice() * 0.1F);
                    return product;
                })
                .toList();
    }

    public Product subjectThree(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals(Product.Type.BOOK))
                .min((o1, o2) -> Float.compare(o1.getPrice(), o2.getPrice()))
                .orElseThrow(() -> new RuntimeException("Продукт [категория: BOOK] не найден"));
    }

    public List<Product> subjectFour(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreatedAt))
                .limit(3)
                .toList();
    }

    public float subjectFive(List<Product> products) {
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getCreatedAt().getYear() == LocalDate.now().getYear()
                        && product.getType().equals(Product.Type.BOOK)
                        && product.getPrice() <= 75)
                .toList();

        float sum = 0;
        for (Product product : filteredProducts) sum += product.getPrice();

        return sum;
    }

}
