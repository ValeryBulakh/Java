package org.example.HomeWork.lesson6.dataSet;

import org.example.HomeWork.lesson6.data.FoneBook;
import org.example.HomeWork.lesson6.data.User;

import java.util.List;

public interface MoveFoneBook {
    void impFOneBook(List<User> foneBook);
    void expFoneBook(FoneBook foneBook);
}