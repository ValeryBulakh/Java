package org.example.HomeWork.lesson7.data;

public class Rational extends Numbers {
    public double num1;
    public double num2;

    public Rational(double num1, double num2) {
        super(num1, num2);
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return (int) num1 + "/" + (int) num2;
    }

}