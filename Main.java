import java.lang.reflect.Method;

/**
 * Класс, который содержит метод main для создания и вывода информации о животных
 */

public class Main {

    /**
     * Метод main для создания и вывода информации о животных
     * @param args-параметры командной строки
     */
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Tuzic", 5, "Staford"), new Dog("Sharic", 6, "Pitbull"), new Cat("Fluffy", 3, true), new Cat("Busia", 7, true)};

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getClass().getSimpleName());
            System.out.println("Age: " + animal.age);
            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println("Cannot make the animal sound");
            }
            System.out.println("-----------------");
        }
    }
}