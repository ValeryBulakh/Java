package org.example.HomeWork.lesson6.view;

import org.example.HomeWork.lesson6.data.FoneBook;
import org.example.HomeWork.lesson6.data.Format;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewConsole {
    List<FoneBook> foneBookList;

    public ViewConsole(List<FoneBook> foneBookList) {
        this.foneBookList = new ArrayList<>();
        this.foneBookList.addAll(foneBookList);
    }

    public void start(){
        boolean flag = true;
        while (flag){
            int n = menu();
            if (n != 99){
                FoneBook listfone = this.foneBookList.get(n);
                System.out.println(listfone.toString());
                boolean flag2 = true;
                while (flag2){
                    int n2 = menuTwo();
                    if (n2 != 99){
                        Format format = new Format();
                        switch (n2){
                            case (1):
                                this.foneBookList.remove(n);
                                int tmp = menu();
                                if (tmp != 99){
                                    listfone.impFOneBook(this.foneBookList.get(tmp).getFoneBook());
                                    this.foneBookList.remove(tmp);
                                    this.foneBookList.add(listfone);
                                    break;
                                } else{
                                    this.foneBookList.add(listfone);
                                    break;
                                }
                            case (2):
                                this.foneBookList.remove(n);
                                int tmp1 = menu();
                                if (tmp1 != 99){
                                    listfone.expFoneBook(this.foneBookList.get(tmp1));
                                    this.foneBookList.remove(tmp1);
                                    this.foneBookList.add(listfone);
                                    break;
                                } else {
                                    this.foneBookList.add(listfone);
                                    break;
                                }
                            case (3):
                                int tmp2 = menuFormat();
                                if (tmp2 != 99){
                                    switch (tmp2) {
                                        case (1) -> format.formatPdf(listfone);
                                        case (2) -> format.formatJson(listfone);
                                    }
                                } else break;
                            case (4):
                                flag2 = false;
                                break;
                        }
                    }
                }
            }else {
                flag = false;
                System.out.println("Выход.");
            }
        }
    }

    private int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете телефонную книгу (для выхода введите: 99): ");
        for (int i = 0; i < this.foneBookList.size(); i++) {
            System.out.println(i + ". Телефонная книга");
        }
        int n1 = scanner.nextInt();
        if (n1 >= this.foneBookList.size() || n1 < 0)
            return 99;
        return n1;
    }

    private int menuTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете действие: ");
        System.out.println("1. Импорт");
        System.out.println("2. Экспорт");
        System.out.println("3. Форматирование");
        System.out.println("4. Выход");
        int n = scanner.nextInt();
        if (n >= 4 || n < 0) {
            return 99;
        }
        return n;
    }

    private int menuFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете действие: ");
        System.out.println("1. Форматировать в PDF");
        System.out.println("2. Форматировать в JSON");
        System.out.println("3. Выход");
        int n = scanner.nextInt();
        if (n >= 3 || n < 0) {
            return 99;
        }
        return n;
    }
}