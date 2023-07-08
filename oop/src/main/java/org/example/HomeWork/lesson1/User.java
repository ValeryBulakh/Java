package org.example.HomeWork.lesson1;

import java.util.ArrayList;

public class User extends Basket{
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        super.products = new ArrayList<Product>();
    }

    public void buy(Product product, Category category) {
        super.addBascet(product, category);
    }


    public User() {
    }
}