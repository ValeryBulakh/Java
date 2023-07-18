package org.example.HomeWork.lesson6.data;

import org.example.HomeWork.lesson6.dataSet.MoveFoneBook;

import java.util.ArrayList;
import java.util.List;

public class FoneBook implements MoveFoneBook {
    private List<User> foneBook;

    public FoneBook() {
        this.foneBook = new ArrayList<>();
    }

    public void setUser(User user){
        foneBook.add(user);
    }
    public User getUser(int id){
        return foneBook.get(id);
    }

    public List<User> getFoneBook(){
        return foneBook;
    }

    @Override
    public String toString() {
        String res = "[";
        for (int i = 0; i < this.foneBook.size(); i++) {
            if (i == this.foneBook.size() - 1){
                res += this.foneBook.get(i).toString() + "]";
            } else {
                res += this.foneBook.get(i).toString() + ", ";
            }
        }
        return res;
    }

    @Override
    public void impFOneBook(List<User> foneBook) {
        for (int i = 0; i < foneBook.size(); i++) {
            this.foneBook.add(foneBook.get(i));
        }
    }

    @Override
    public void expFoneBook(FoneBook foneBook) {
        for (int i = 0; i < this.foneBook.size(); i++) {
            foneBook.setUser(this.foneBook.get(i));
        }
    }
}