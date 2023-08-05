package lesson3.view;

import lesson3.controller.CheckUser;
import lesson3.controller.ChekUser;
import lesson3.controller.SaveUsser;
import lesson3.moduls.NoFolder;
import lesson3.moduls.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    CheckUser checkUser;
    SaveUsser saveUsser;
    List<User> userList;

    public View (){
        checkUser = new CheckUser();
        saveUsser = new SaveUsser();
        userList = new ArrayList<>();
    }

    public void start() throws NoFolder {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            int n = 0;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            System.out.println("Введите ФИО, дату рождения, номер телефона и гендер в формате" +
                    "\n" + "Фамилия Имя Отчество dd.mm.yyyy 89xxxxxxxxx f или m");
            String data = scanner.nextLine();
            String tmp = data.trim();
            String[] strArr = tmp.split(" ");
            if (strArr.length != 6) {
                System.out.println("Вы ввели некорректные данные, посмотрите внимательно на подсказку выше!" +
                        "\n" + "Еще раз попробуем?(y/n)");
                String tmp2 = scanner.nextLine();
                if (tmp2.charAt(0) == 'n'){
                    flag = false;
                }
            } else {
                try {
                    checkUser.checkName(strArr[0]);
                    checkUser.checkName(strArr[1]);
                    checkUser.checkName(strArr[2]);
                    n++;
                } catch (RuntimeException ex){
                    System.out.println(ex.getMessage());
                }
                if (n != 0){
                    try {
                        checkUser.checkDate(strArr[3]);
                        n1++;
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                }
                if (n1 != 0){
                    try {
                        checkUser.checkNumber(strArr[4]);
                        n2++;
                    } catch (RuntimeException ex1){
                        System.out.println(ex1.getMessage());
                    }
                }
                if (n2 != 0){
                    try {
                        checkUser.checkGender(strArr[5]);
                        n3++;
                    } catch (RuntimeException ex3){
                        System.out.println(ex3.getMessage());
                    }
                }
                if (n3 != 0){
                    User user = new User(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
                    try {
                        saveUsser.saveUser(user);
                        System.out.println("Продолжим работу?(y/n)");
                        String tmp5 = scanner.nextLine();
                        if (tmp5.charAt(0) == 'n'){
                            flag = false;
                        }
                    } catch (NoFolder ex4){
                        System.out.println(ex4.getMessage());
                    }

                }

            }
        }
    }
}