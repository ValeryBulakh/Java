package org.example.HomeWork.calculat.data;

public class Komplex {
    public double a;
    public double b;

    public Komplex(double num1, double num2) {
        a = num1;
        b = num2;
    }

    @Override
    public String toString() {
        return String.format("%f + %fi", a, b);
    }
}