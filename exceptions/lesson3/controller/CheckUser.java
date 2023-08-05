package lesson3.controller;

import lesson3.moduls.NumberException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckUser implements ChekUser{
    List<String> alf;
    List<Integer> num;

    public CheckUser() {
        this.alf = new ArrayList<>(Arrays.asList("а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к",
                "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь",
                "э", "ю", "я"));
    }

    private boolean checkPoint(String date){
        int n = 0;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '.'){
                n++;
            }
        }
        if (n != 2){
            return false;
        }
        return true;
    }

    private boolean checkNum(char a){
        try {
            int n1 = Integer.parseInt(String.valueOf(a));
        }catch (NumberFormatException e){
            throw new NumberException();
        }
        return true;
    }

    @Override
    public String checkName(String name) {
        String str = name.trim();
        if (str.length() <= 1){
            throw new RuntimeException("Вы ввели слишком короткое имя! -> " + name);
        }
        for (int i = 0; i < str.length(); i++) {
            if (!alf.contains(String.valueOf(str.charAt(i)).toLowerCase())){
                throw new RuntimeException("В имени есть недопустимые символы! -> " + name);
            }
        }
        return name;
    }

    @Override
    public String checkDate(String date) {
        String str1 = date.trim();
        if (str1.length() != 10){
            throw new RuntimeException("Неверный формат даты, введите dd.mm.yyyy");
        }
        if (!checkPoint(str1)){
            throw new RuntimeException("Неверный формат даты, введите dd.mm.yyyy");
        }
        String str2 = str1.replaceAll("\\.", "");

        for (int i = 0; i < str2.length(); i++) {
            try{
                checkNum(str2.charAt(i));
            } catch (NumberException e){
                throw new RuntimeException(e.getMessage() + " -> " + str2.charAt(i));
            }
        }

        return str1;
    }

    @Override
    public String checkNumber(String number) {
        String str = number.trim();
        if (str.length() != 11){
            throw new RuntimeException("Вы же россиянен?! Вводите 11 цифр(89xxxxxxxxx)! А не это -> " + str);
        }
        for (int i = 0; i < str.length(); i++) {
            try{
                checkNum(str.charAt(i));
            } catch (NumberException e){
                throw new RuntimeException(e.getMessage() + " -> " + str.charAt(i));
            }
        }
        return str;
    }
    @Override
    public String checkGender(String gender){
        String str = gender.trim();
        if (str.length() != 1){
            throw new RuntimeException("Гендер указывается одной буквой: f или m");
        }
        if (str.charAt(0) != 'f'){
            if (str.charAt(0) != 'm'){
                throw new RuntimeException("Гендер указывается одной буквой: f или m");
            }
        }
        return str;
    }
}