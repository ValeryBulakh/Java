package java.api.lesson;

import java.util.Scanner;

public class HW02 {
    //Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = iScanner.nextInt();
        iScanner.close();
        simpleNumber(num);
    }

    /**
     * @apiNote Вывести все простые числа от 1 до 1000
     * @param n заданное число
     */
    private static void simpleNumber(int n) {
        for (int i = 2; i <= n; i++) {
            boolean flagIsSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flagIsSimple = false;
                    break;
                }
            }
            if (flagIsSimple) System.out.println(i);
        }
    }
} 