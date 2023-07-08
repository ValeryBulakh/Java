package jv.api.lesson.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
              System.out.println("Укажите номер действия со списком:");
            System.out.println("1 - Отобразить изначальный список");
            System.out.println("2 - Удалить из списка чётные числа");
            System.out.println("3 - Найти минимальное значение");
            System.out.println("4 - Найти максимальное значение");
            System.out.println("5 - Найти среднее значение");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            int choice = Integer.parseInt(scanner.nextLine());
            scanner.close();

            switch (choice) {
                case 1:
                    System.out.println("Изначальный список: " + numbers);
                    break;
                case 2:
                    List<Integer> oddNumbers = removeEvenNumbers(numbers);
                    System.out.println("Список после удаления чётных чисел: " + oddNumbers);
                    break;
                case 3:
                    int minValue = findMinValue(numbers);
                    System.out.println("Минимальное значение: " + minValue);
                    break;
                case 4:
                    int maxValue = findMaxValue(numbers);
                    System.out.println("Максимальное значение: " + maxValue);
                    break;
                case 5:
                    double averageValue = findAverageValue(numbers);
                    System.out.println("Среднее значение: " + averageValue);
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    running = false;
                    break;
                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода.");
                    break;
            }
        }
    }


    private static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    private static int findMinValue(List<Integer> numbers) {
        int minValue = numbers.get(0);
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    private static int findMaxValue(List<Integer> numbers) {
        int maxValue = numbers.get(0);
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    private static double findAverageValue(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
    
}