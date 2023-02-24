/**
 * @author Byzov A.A.
 */
/*
Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.

Пример ввода: [3,5,20,8,7,3,100]

Пример вывода: 3,5,7,3

Требования:
Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */
public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr1);
    }

    public static void printOddNumbers(int[] arr) {
        String separator = "";
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(separator);
                System.out.print(j);
                separator = ",";
            }
        }
        System.out.println();
    }
}
