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
        int[] arr1 = {2, 4, 6, 8};
        printOddNumbers(arr1);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder arrWithSeparator = new StringBuilder();
        int count = 0;
        if (arr.length == 0) {
            arrWithSeparator.append("[]");
            return;
        }
        for (int i : arr) {
            if (i % 2 != 0) {
                arrWithSeparator.append(arr[i]).append(",");
                count++;
            }
            if (count == 0) {
                arrWithSeparator.append("[]");
            } else {
                System.out.println(arrWithSeparator.deleteCharAt(arrWithSeparator.length() - 1));
            }
        }
    }
}
