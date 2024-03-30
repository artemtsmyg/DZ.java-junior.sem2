import java.lang.reflect.Method;

/**
 * Класс, который содержит метод main для создания и вывода информации о животных
 */

 public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Барон", 3, "Бультерьер"), new Dog("Шарик", 7, "Питбуль"), new Cat("Буся", 7, false), new Cat("Мурка", 4, true)};

        for (Animal animal : animals) {
            // Вывод информации о каждом объекте
            System.out.println("Имя: " + animal.name + ", Возраст: " + animal.age);

            // Вызов метода makeSound() с использованием Reflection API
            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (Exception e) {
                System.out.println("У объекта " + animal.getClass().getSimpleName() + " отсутствует метод makeSound.");
            }
        }
    }
}