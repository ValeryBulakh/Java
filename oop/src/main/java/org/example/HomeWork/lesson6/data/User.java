package org.example.HomeWork.lesson6.data;

public class User {
    private String name;
    private int number;

    public User(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", number=" + number + "}";
    }
}