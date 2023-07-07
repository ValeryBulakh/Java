package java.api.lesson;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = iScanner.nextInt();
        System.out.printf("Calculate the %d triangular number = %d", input, triangularNumber(input));
        iScanner.close();
    }

    /**
     * @apiNote Вычислить n-ое треугольного число, n!
     * @param n заданное число
     * @return результат
     */
    private static int triangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}