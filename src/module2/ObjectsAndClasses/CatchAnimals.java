package module2.ObjectsAndClasses;

/**
 * @author Byzov A.A.
 */

/*
Задание:
Создайте класс Cat и класс Dog. В классе Cat должен быть метод sayHello(), который выводит в консоль "Мяу!", аналогично с собакой, но выводит "Гав!". Так же, у собаки должен быть метод catchCat (поймать кошку), который принимает кошку и дальше делает следующее:


1) выводит в консоль сообщение "Кошка поймана"
2) У собаки, которая поймала кошку должен быть вызван метод sayHello()
3) У кошки, которую поймала собака должен быть вызван метод sayHello()

Требования:
1. Должен быть класс public static class Cat
2. Должен быть класс public static class Dog
3. Все методы должны быть public
4. Кошка должна говорить “Мяу!”
5. Собака должна говорить “Гав!”
6. Собака должна ловить кошку
 */
public class CatchAnimals {
    // Для тестирования
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sayHello();
        dog.sayHello();
        dog.catchCat(cat);
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
