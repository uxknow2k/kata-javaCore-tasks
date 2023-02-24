import java.util.Arrays;

/*
Урок с кодом
Цель: Слить два произвольных массива в один отсортированный

Что нужно знать:

1. Массивы

2. Циклы

3. Условные операторы

Задание:

Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает соединяет и сортирует два произвольных массива чисел

Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}

Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]

Пример ввода: {} {1, 4, 3}

Пример вывода: [1, 3, 4]

Требования:

1. метод должен быть public static
2. сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
3 Не использовать Arrays.
 */

public class MergeAndSort {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 7, 5};
        int[] arr2 = {8, 4, 2, 4};
        System.out.println("Первый массив - " + Arrays.toString(arr1));
        System.out.println("Второй массив - " + Arrays.toString(arr2));
        System.out.println("Результат - " + Arrays.toString(mergeAndSort(arr1, arr2)));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int resultsPosition = 0;
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            resultsPosition++;
        }

        for (int j = 0; j < secondArray.length; j++) {
            resultArray[resultsPosition++] = secondArray[j];
        }

        for (int i = 0; i < resultArray.length - 1; i++) {
            for (int j = 0; j < resultArray.length - i - 1; j++) {
                if (resultArray[j + 1] < resultArray[j]) {
                    int swap = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = swap;
                }
            }

        }
        return resultArray;
    }
}
