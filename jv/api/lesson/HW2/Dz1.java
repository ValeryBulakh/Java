package jv.api.lesson.HW2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Dz1 {

public class Main {
    public static void main(String[] args) {
        // Задание 1
        String sqlQuery = "select * from students where ";
        StringBuilder whereClause = new StringBuilder();

        String filterJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        if (filterJson != null && !filterJson.isEmpty()) {
            String name = null;
            String country = null;
            String city = null;
            String age = null;

            if (filterJson.contains("\"name\":\"")) {
                name = filterJson.split("\"name\":\"")[1].split("\"")[0];
            }
            if (filterJson.contains("\"country\":\"")) {
                country = filterJson.split("\"country\":\"")[1].split("\"")[0];
            }
            if (filterJson.contains("\"city\":\"")) {
                city = filterJson.split("\"city\":\"")[1].split("\"")[0];
            }
            if (filterJson.contains("\"age\":\"")) {
                age = filterJson.split("\"age\":\"")[1].split("\"")[0];
            }

            if (name != null) {
                whereClause.append("name = '").append(name).append("' ");
            }
            if (country != null) {
                if (whereClause.length() > 0) {
                    whereClause.append("AND ");
                }
                whereClause.append("country = '").append(country).append("' ");
            }
            if (city != null) {
                if (whereClause.length() > 0) {
                    whereClause.append("AND ");
                }
                whereClause.append("city = '").append(city).append("' ");
            }
            if (age != null && !age.equalsIgnoreCase("null")) {
                if (whereClause.length() > 0) {
                    whereClause.append("AND ");
                }
                whereClause.append("age = ").append(age).append(" ");
            }
        }

        String finalQuery = sqlQuery + whereClause.toString();
        System.out.println("Final SQL Query: " + finalQuery);


        // Задание 2
        int[] array = {5, 2, 7, 1, 3};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            boolean swapped;
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                writer.write("After iteration " + (i + 1) + ": " + arrayToString(array) + "\n");
                if (!swapped) {
                    break;
                }
            }
            writer.write("Final sorted array: " + arrayToString(array) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
}