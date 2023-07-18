package org.example.HomeWork.lesson7.dataServis;

import org.example.HomeWork.lesson7.data.Komplex;
import org.example.HomeWork.lesson7.data.Rational;

public class Calculate implements Operations{

    @Override
    public Rational sum(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 + number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 + number.num1, number2.num2 * number.num2);
        }
    }
    @Override
    public Komplex sum(Komplex number, Komplex number2){
        return new Komplex(number.a + number2.a, number.b + number2.b);
    }
    @Override
    public Rational raznoct(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 - number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 - number.num1, number2.num2 * number.num2);
        }
    }
    @Override
    public Komplex raznoct(Komplex number, Komplex number2){
        return new Komplex(number.a - number2.a, number.b - number2.b);
    }
    @Override
    public Rational multy(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num1, number2.num2 * number.num2);
    }
    @Override
    public Komplex multy(Komplex number, Komplex number2){
        return new Komplex((number.a * number2.a) - (number.b * number2.b),
                (number.b * number2.a) + (number2.b * number.a));
    }
    @Override
    public Rational div(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num2, number2.num2 * number.num1);
    }
    @Override
    public Komplex div(Komplex number, Komplex number2){
        return new Komplex((number.a * number2.a + number.b * number2.b) /
                (number2.a * number2.a + number2.b * number2.b),
                (number.b * number2.a - number.a * number2.b) /
                        (number2.a * number2.a + number2.b * number2.b));
    }


}