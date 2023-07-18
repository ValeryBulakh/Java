package org.example.HomeWork.lesson6.dataSet;

import org.example.HomeWork.lesson6.data.FoneBook;
import org.example.HomeWork.lesson6.data.User;

import java.util.List;

public interface Formater {
    FoneBook formatPdf(FoneBook foneBook);
    FoneBook formatJson(FoneBook foneBook);
}