package org.example.HomeWork.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculat calculat = new Calculat();
        String str = "4.65";
        String str1 = "4.0";
        String str2 = "4";
        List<Double> test1 = new ArrayList<>(Arrays.asList(1.2, 3.3, 4.4));
        List<Integer> test2 = new ArrayList<>(Arrays.asList(1, 3, 4));

        System.out.println("calculat.multy(test1) = " + calculat.multy(test1));
        System.out.println("calculat.division(test2) = " + calculat.division(test2));
        System.out.println("calculat.translateBinary(str) = " + calculat.translateBinary(str));
        System.out.println("calculat.translateBinary(str1) = " + calculat.translateBinary(str1));
        System.out.println("calculat.translateBinary(str2) = " + calculat.translateBinary(str2));
    }


}