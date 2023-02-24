package stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Byzov A.A.
 */
/*
Цель: Работа с регулярными выражениями

Что нужно знать:

1. Классы String, Pattern, Matcher

2. Регулярные выражения

Задание:

Реализовать метод, который будет принимать целочисленное строку, и отвечать соответствует ли эта строка почтовому ящику сервисов google (gmail.com) или майкрософт (outlook.com). Будет считать, что в корректном почтовом ящике можно использовать только цифры и буквы.

Пример ввода: "kata12@gmail.com"

Пример вывода: true

Пример ввода: "@outlook.com"

Пример вывода: false

Требования:

1. метод должен быть public static
2. сигнатура метода isGmailOrOutlook(String email)
3. метод возвращает boolean
 */
public class EmailChecker {
    public static void main(String[] args) {
        String email = "kata12@gmail.com";
        String email2 = "@outlook.com";
        System.out.println(isGmailOrOutlook(email));
        System.out.println("---------");
        System.out.println(isGmailOrOutlook(email2));
    }
public static boolean isGmailOrOutlook(String email) {
    Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}
}
