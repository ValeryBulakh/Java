package org.example.HomeWork.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    String name;
    List<Product> products;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
        this.products = new ArrayList<>();
    }

    public void delProduct(Product product, Category category){
        for (int i = 0; i < category.products.size(); i++) {
            if (category.products.get(i).equael(product)){
                category.products.remove(category.products.get(i));
            }
        }
    }


    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}