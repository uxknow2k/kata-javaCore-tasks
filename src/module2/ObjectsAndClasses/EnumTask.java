package module2.ObjectsAndClasses;

/**
 * @author Byzov A.A.
 */
/*
Цель: Научиться создавать перечисления (Enum)

Что нужно знать:

1. Enum

Задание:

Реализовать Enum Day, который будет отвечать за дни недели. Этот Enum должен содержать следующие элементы:


MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

Так же, в этом Enum должны быть релизованы два метода:

1. public boolean isWeekend() - метод, отвечающий на вопрос, является ли конкретный элемент - выходным днем. (выходным днем являются только суббота и воскресенье)

2. public String getRusName() - метод, возвращающий русское название дня недели

Требования:

1. Enum должен иметь название Day
2. Enum должен содеражить элементы на каждый день недели
3. сигнатура метода isWeekend()
4. метод isWeekend возвращает boolean
5. сигнатура метода getRusName()
6. метод getRusName возвращает String
 */
public class EnumTask {
    public enum Day {

        SUNDAY("Воскресенье", true),
        MONDAY("Понедельник", false),
        TUESDAY("Вторник", false),
        WEDNESDAY("Среда", false),
        THURSDAY("Четверг", false),
        FRIDAY("Пятница", false),
        SATURDAY("Суббота", true);
        private final String title;
        private final boolean weekend;

        Day(String title, Boolean weekend) {
            this.title = title;
            this.weekend = weekend;
        }

        public String getRusName() {
            return title;
        }

        public boolean isWeekend() {
            return weekend;

        }
    }
}
