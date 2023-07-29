package lesson2;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        askUser();

    }

    /**
     * @apiNote Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    private static void askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String str = scanner.nextLine();
        try{
            chekStr(str);
            System.out.println(str);
        } catch (Exception ex){
            System.out.println("Пустые строки вводить нельзя!");
            askUser();
        }
    }

    /**
     * Метод для проверки строки на пустоту
     * @param str строка
     * @return строка или ошибка
     */
    public static String chekStr(String str){
        if (str.length() == 0){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                count++;
                break;
            }
        }
        if (count == 0){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        return str;
    }
}