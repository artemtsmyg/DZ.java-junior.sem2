/**
 * Класс представляет собой объект типа "Кошка", который является подклассом класса "Животное"
 *  с дополнительным свойством - лень.
 */

class Cat extends Animal {
    private boolean isLazy;

    /**
     * Конструктор класса Cat, который принимает имя, возраст и значение лени кошки.
     * @param name-Имя кошки
     * @param age-Возраст кошки
     * @param isLazy-Указывает, является ли кошка ленивой
     */

    public Cat(String name, int age, boolean isLazy) {
        super(name, age);
        this.isLazy = isLazy;
    }

    /**
     * Переопределенный метод из класса Animal для издания звука как кошка.
     */

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    /**
     * Метод для кошки царапать мебель
     */

    public void scratchFurniture() {
        System.out.println(super.name + " is scratching the furniture");
    }
}