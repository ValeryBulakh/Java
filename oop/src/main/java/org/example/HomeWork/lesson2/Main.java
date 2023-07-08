package org.example.HomeWork.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Obstacles[] prepytstvia = {
                new Treadmill("Дорожка1", 50),
                new Wall("Стена1", 1),
                new Treadmill("Дорожка2", 100),
                new Wall("Стена2", 2),
                new Treadmill("Дорожка3", 200),
                new Wall("Стена3", 3)
        };
         */
        List<Obstacles> prepyt = new ArrayList<>();
        prepyt.add(new Treadmill("Дорожка1", 50));
        prepyt.add(new Wall("Стена1", 1));
        prepyt.add(new Treadmill("Дорожка2", 100));
        prepyt.add(new Wall("Стена2", 2));
        prepyt.add(new Treadmill("Дорожка3", 200));
        prepyt.add(new Wall("Стена3", 3));
        List<Doing> list = new ArrayList<>();
        list.add(new Human("Чел1"));
        list.add(new Cat("Кот1"));
        list.add(new Robot("Робот1"));


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < prepyt.size(); j++) {
                if (prepyt.get(j) instanceof Treadmill) {
                    list.get(i).run((Treadmill) prepyt.get(j));
                    if (list.get(i).getFlag() != 0) {
                        System.out.println("Выбыл " + list.get(i).getName());
                        list.remove(list.get(i));
                        i--;
                        break;
                    }
                } else {
                    list.get(i).jump((Wall) prepyt.get(j));
                    if (list.get(i).getFlag() != 0) {
                        System.out.println("Выбыл " + list.get(i).getName());
                        list.remove(list.get(i));
                        i--;
                        break;
                    }
                }
            }
        }
        for (Doing el : list) {
            System.out.println("Все преодолел " + el.getName());
        }
    }
}