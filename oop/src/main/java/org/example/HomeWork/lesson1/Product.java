package org.example.HomeWork.lesson1;

public class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public boolean equael(Product product){
        if (this.name == product.name && this.price == product.price && this.rating == product.rating) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}