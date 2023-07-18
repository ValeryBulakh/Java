package org.example.HomeWork.lesson6;

import org.example.HomeWork.lesson6.data.FoneBook;
import org.example.HomeWork.lesson6.data.User;
import org.example.HomeWork.lesson6.view.ViewConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoneBook foneBook1 = new FoneBook();
        for (int i = 0; i < 5; i++) {
            foneBook1.setUser(new User("Иван", 1000 + i));
        }
        FoneBook foneBook2 = new FoneBook();
        for (int i = 0; i < 3; i++) {
            foneBook2.setUser(new User("Петр", 1000 + i));
        }
        List<FoneBook> bookList = new ArrayList<>(Arrays.asList(foneBook1, foneBook2));
        ViewConsole view = new ViewConsole(bookList);
        view.start();

    }
}