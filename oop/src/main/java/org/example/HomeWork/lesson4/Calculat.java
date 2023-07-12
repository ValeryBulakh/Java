package org.example.HomeWork.lesson4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Calculat {

    public double sum(List<? extends Number> numbers){
        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
    public double multy(List<? extends Number> numbers){
        double result = 1.0;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> numbers) {
        double result = 1.0;
        for (Number number : numbers) {
            result /= number.doubleValue();
        }
        return result;
    }

    public String translateBinary(String strNum){
        double number = Double.parseDouble(strNum);
        int firstNum = (int) number;
        double lastNum = number % firstNum;
        int countT = 0;
        for (String s : strNum.split("")) {
            if (s.charAt(0) == '.'){
                countT++;
            }
        }
        if (countT == 0) {
            return Integer.toBinaryString(firstNum);
        } else {
            if (lastNum == 0){
                return Integer.toBinaryString(firstNum);
            }else {
                return Integer.toBinaryString(firstNum) + "," +
                        Long.toBinaryString(Double.doubleToRawLongBits(lastNum));
            }
        }
    }

}