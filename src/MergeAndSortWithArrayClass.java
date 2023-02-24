import java.util.Arrays;

/**
 * @author Byzov A.A.
 */

/*
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

метод должен быть public static
сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
 */
public class MergeAndSortWithArrayClass {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 5};
        int[] arr2 = {8, 4, 2, 4};
        int[] arr3 = {};
        int[] arr4 = {1, 4, 3};
        System.out.println("1) " + Arrays.toString(mergeAndSort(arr1, arr2)));
        System.out.println("2) " + Arrays.toString(mergeAndSort(arr3, arr4)));

    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        Arrays.sort(newArray);
        return newArray;
    }
}