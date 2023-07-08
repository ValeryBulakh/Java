package org.example.HomeWork.lesson1;

import java.util.List;

public class Basket extends Category{
    List<Product> products;

    public void addBascet(Product product, Category category){
        this.products.add(product);
        super.delProduct(product, category);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}