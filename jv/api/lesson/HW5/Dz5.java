package jv.api.lesson.HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dz5 {
    private Map<String, List<String>> phoneBook;

    public Dz5() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Dz5 directory = new Dz5();

        directory.add("Сидоров", "874563218");
        directory.add("Петров", "874517321");
        directory.add("Иванов", "789642358");
        directory.add("Сидоров", "659874123");
        directory.add("Сергеев", "589657132");

        List<String> sidorovNumbers = directory.get("Сидоров");
        System.out.println("Номера телефона по фамилии Сидоров: " + sidorovNumbers);

        List<String> petrovNumbers = directory.get("Петров");
        System.out.println("Номера телефона по фамилии Петров: " + petrovNumbers);

        List<String> sergeevNumbers = directory.get("Сергеев");
        System.out.println("Номера телефона по фамилии Сергеев: " + sergeevNumbers);

        List<String> ivanovNumbers = directory.get("Иванов");
        System.out.println("Номера телефона по фамилии Иванов: " + ivanovNumbers);
    }
}