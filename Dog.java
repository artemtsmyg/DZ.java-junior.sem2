/**
 * Класс, представляющий собаку
 */

class Dog extends Animal {
    private String breed;

    /**
     * Конструктор класса Dog.
     * @param name-имя собаки
     * @param age-возраст собаки
     * @param breed-порода собаки
     */

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    /**
     * Переопределенный метод для издания звука собакой
     */

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    /**
     * Метод для игры с собакой
     */

    public void fetch() {
        System.out.println("Playing fetch with " + super.name);
    }
}
