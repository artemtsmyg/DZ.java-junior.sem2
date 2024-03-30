/**
 * Абстрактный класс Animal представляет собой абстракцию животного.
 */

public abstract class Animal {
    protected String name;// Имя животного
    int age;// Возраст животного

    /**
     * Конструктор класса Animal
     * @param name-Имя животного
     * @param age-Возраст животного
     */

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Абстрактный метод для издания звука животным
     */

    public abstract void makeSound();
}