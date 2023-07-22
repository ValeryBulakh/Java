package JavaFinalWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                '}';
    }
}

public class ToyStore {
    private List<Toy> toys;
    private Random random;

    public ToyStore() {
        toys = new ArrayList<>();
        random = new Random();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void drawToys() {
        List<Toy> weightedToys = new ArrayList<>();

        for (Toy toy : toys) {
            int weight = (int) (toy.getWeight() * 100);
            for (int i = 0; i < weight; i++) {
                weightedToys.add(toy);
            }
        }

        if (weightedToys.isEmpty()) {
            System.out.println("Добавьте игрушки и установите им вес перед розыгрышем.");
            return;
        }

        int index = random.nextInt(weightedToys.size());
        Toy winnerToy = weightedToys.get(index);
        System.out.println("Поздравляем! Игрушка: " + winnerToy.getName() + " - победитель розыгрыша!");
    }

    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("\nВыберите опцию:");
            System.out.println("1 - Добавить новую игрушку");
            System.out.println("2 - Изменить вес игрушки");
            System.out.println("3 - Организовать розыгрыш игрушек");
            System.out.println("0 - Выйти");

            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Введите id игрушки:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Введите название игрушки:");
                    String name = scanner.nextLine();
                    System.out.println("Введите количество игрушек:");
                    int quantity = scanner.nextInt();
                    System.out.println("Введите вес игрушки в процентах (от 0 до 100):");
                    double weight = scanner.nextDouble() / 100.0;

                    Toy newToy = new Toy(id, name, quantity, weight);
                    toyStore.addToy(newToy);
                    break;

                case 2:
                    System.out.println("Введите id игрушки, для которой хотите изменить вес:");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите новый вес игрушки в процентах (от 0 до 100):");
                    double newWeight = scanner.nextDouble() / 100.0;
                    toyStore.updateWeight(toyId, newWeight);
                    break;

                case 3:
                    toyStore.drawToys();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }

        } while (option != 0);

        scanner.close();
    }
}
