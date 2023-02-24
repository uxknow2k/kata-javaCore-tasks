import java.util.Arrays;

/**
 * @author Byzov A.A.
 */

/*
Цель: Вернуть середину массива

Что нужно знать:

1. Массивы

2. Класс Arrays.

Задание:

Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины, то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.

Пример ввода: {1, 5, 2, 17}

Пример вывода: [5, 2]

Пример ввода: {14, 16, 3}

Пример вывода: [16]

Пример ввода: {}

Пример вывода: []

Требования:

1. Метод должен быть public static
2. Сигнатура метода getArrayMiddle(int[] numbers)
3. Использовать Arrays или System.arrayCopy
 */
public class GerArrayMiddle {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 17};
        System.out.println("1) " + Arrays.toString(getArrayMiddle(arr)));
        int[] arr2 = {14, 16, 3};
        System.out.println("2) " + Arrays.toString(getArrayMiddle(arr2)));
        int[] arr3 = {};
        System.out.println("3) " + Arrays.toString(getArrayMiddle(arr3)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int[] arrNew;
        if (numbers.length % 2 == 0 && numbers.length != 0) {
            arrNew = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
        } else if (numbers.length % 2 != 0) {
            arrNew = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
        } else {
            arrNew = new int[0];
        }
        return arrNew;
    }
}
