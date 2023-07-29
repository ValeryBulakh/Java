package lesson2;


/*
Если необходимо, исправьте данный код (задание 2)
 */

/*
Обернул все в метод, в аргумент беру массив intArray(т.к. java не дает скомпелировать код)
Добавил еще один catch для того, чтобы поймать исключение связанное с индексом данного массива
 */
public class Task2 {
    public static void main(String[] args) {
        // int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        task2(intArray);

    }

    public static void task2(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Нет элемента под индексом: 8");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}