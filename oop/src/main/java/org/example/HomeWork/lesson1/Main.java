package org.example.HomeWork.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Банан", 45.5, 4.5);
        Product product2 = new Product("Яблоко", 40.0, 4.7);
        Product product3 = new Product("Вишня", 35.50, 5.5);
        Product test = new Product("Вишня", 35.50, 5.5);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        Category category1 = new Category("Фрукты", products);
        System.out.println("category1 = " + category1);


        Product product4 = new Product("Курица", 145.90, 10.5);
        Product product5 = new Product("Свинина", 340.0, 7.7);
        Product product6 = new Product("Говядина", 535.50, 5.5);
        List<Product> products2 = new ArrayList<>();
        products2.add(product4);
        products2.add(product5);
        products2.add(product6);
        Category category2 = new Category("Мясо", products2);
        System.out.println("category2 = " + category2);

        User user1 = new User("Иванов Иван", "123456");
        User user2 = new User("Петров Петр", "000000");
        user1.buy(product1, category1);
        user2.buy(product6, category2);
        System.out.println("user1.products = " + user1.products);
        System.out.println("user2.products = " + user2.products);

        System.out.println("category1 = " + category1);
        System.out.println("category2 = " + category2);


    }
}