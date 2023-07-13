package org.example.HomeWork.calculat.data;

public class Rational {
    public int num1;
    public int num2;

    public Rational(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /*
    public Rational sum(Rational number){
        return new Rational(this.num1 + number.num1, this.num2 * number.num2);
    }

    public Rational raznoct(Rational number){
        return new Rational(this.num1 - number.num1, this.num2 * number.num2);
    }

    public Rational multy(Rational number){
        return new Rational(this.num1 * number.num1, this.num2 * number.num2);
    }

    public Rational div(Rational number){
        return new Rational(this.num1 * number.num2, this.num2 * number.num1);
    }

     */



    @Override
    public String toString() {
        return num1 + "/" + num2;
    }

}