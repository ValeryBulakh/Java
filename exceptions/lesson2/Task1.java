package lesson2;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        askFloat();
    }

    private static void askFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (типа float): ");
        try{
            double n = scanner.nextDouble();
            System.out.println(n);
        } catch (InputMismatchException e){
            System.out.println("Вы ввели неправильное число, попробуйте снова");
            askFloat();
        }
    }

}