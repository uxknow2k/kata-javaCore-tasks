package module2.ObjectsAndClasses;

/**
 * @author Byzov A.A.
 */
/*
Цель: Переиспользование методов

Что нужно знать:

1. if/else

2. Массивы

3. Циклы

Одним из принципов хорошего кода является DRY - Don’t repeat yourself (не повторяй себя). Простыми словами, его идея заключается в том, что при написании кода программист не должен одинаковую копировать логику/код в несколько разных мест, вместо этого код нужно организовывать на такие логические куски, которые можно будет переиспользовать. (Кому интересно почитать подробнее можно ознакомиться со статьей https://habr.com/ru/post/144611/)

Задание:

Реализуй три метода:

1. boolean isWeekend(String dayName) - метод принимает строку и отвечает, является ли данная строка выходным днем. Выходным днем являются Sunday и Saturday.

2. int weekendCount(String[] days) - метод принимает массив строк и возвращает количество выходных дней в этом массиве.

3. int weekdayCount(String[] days) - метод принимает массив строк и возвращает количество будних дней в этом массиве.

Требования:

1. методы должы быть public static
2. сигнатура метода isWeekend(String dayName)
3. метод возвращает boolean
4. сигнатура метода weekendCount(String[] days)
5. метод возвращает int
6. сигнатура метода weekdayCount(String[] days)
7. метод возвращает int
8. переиспользовать методы, не копировать код
 */
public class WeekendAndWeekdays {
    public static void main(String[] args) {
        String[] arr1 = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(isWeekend("Sunday") + " является ли выходным днем?");
        System.out.println("Количество выходных в неделе - " + weekendCount(arr1));
        System.out.println("Количество будних дней в неделе - " + weekdayCount(arr1));
    }

    public static boolean isWeekend(String dayName) {
        return dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday");
    }

    public static int weekendCount(String[] days) {
        int weekend = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                weekend++;
            }
        }
        return weekend;
    }

    public static int weekdayCount(String[] days) {
        int weekday = 0;
        for (String day : days) {
            if (!isWeekend(day))
                weekday++;

        }
        return weekday;
    }
}
